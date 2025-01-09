import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {
        // Check for duplicate ID
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Error: A book with ID " + book.getId() + " already exists.");
                return; // Exit the method if duplicate ID is found
            }
        }

        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // View all books
    public void viewBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Search for a book by title
    public void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book not found with title: " + title);
    }

    // Borrow a book
    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You borrowed: " + book.getTitle());
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
                } else {
                    System.out.println("This book wasn't borrowed.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }
}