public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor to initialize all fields
    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Constructor for when availability is not specified (default to true)
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default availability
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }


    // Using for the displaying of the available books in the program
    @Override
    public String toString() {
        return "Book{" +
                "ID=" + id +
                ", Title111='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Available=" + isAvailable +
                '}';
    }
}
