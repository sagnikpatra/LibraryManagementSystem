import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private final String FILE_NAME = "library_data.txt";

    public Library() {
        loadBooksFromFile();
    }

    // Add a new book
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Error: A book with ID " + book.getId() + " already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
        saveBooksToFile();
    }

    // View all books
    public void viewBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Borrow a book
    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You borrowed: " + book.getTitle());
                    saveBooksToFile();
                } else {
                    System.out.println("Sorry, the book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    // Return a book
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You returned: " + book.getTitle());
                    saveBooksToFile();
                } else {
                    System.out.println("This book wasn't borrowed.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    // Save books to file
    private void saveBooksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                writer.write(book.getId() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.isAvailable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }
    }

    // Load books from file
    private void loadBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String author = parts[2];
                boolean isAvailable = Boolean.parseBoolean(parts[3]);
                books.add(new Book(id, title, author, isAvailable));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing data file found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }
    }

    public void searchBookByTitle(String title) {
        System.out.println("\nSearch Results:");
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the title containing: " + title);
        }
    }
}
