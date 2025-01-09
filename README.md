# Library Management System

## Overview
The Library Management System is a console-based Java application designed to manage library operations efficiently. It provides functionalities to add books, view available books, search for books, and manage borrowing and returning operations. The project demonstrates the use of Object-Oriented Programming (OOP) principles and serves as a foundation for building more complex systems.

---

## Features
- **Add Books**: Add new books to the library with unique IDs, titles, and authors.
- **View Books**: Display all books in the library, including their availability status.
- **Search Books**: Search for books by title to quickly locate them.
- **Borrow Books**: Borrow books by ID, with availability status updates.
- **Return Books**: Return borrowed books and update their status to available.
- **Validation**: Prevents duplicate book IDs to ensure data integrity.

---

## Technologies Used
- **Programming Language**: Java
- **Development Tools**: Any IDE (e.g., IntelliJ IDEA, Eclipse) or text editor with JDK installed
- **Data Structure**: ArrayList for managing book records

---

## How to Run the Project

1. **Setup Environment**:
   - Install Java Development Kit (JDK).
   - Set up a Java IDE or a text editor with terminal support.

2. **Clone or Download**:
   - Clone the repository or download the project files.

3. **Compile and Run**:
   - Open the terminal or IDE.
   - Navigate to the project folder.
   - Compile the project:
     ```
     javac LibraryManagementSystem.java
     ```
   - Run the project:
     ```
     java LibraryManagementSystem
     ```

4. **Interact with the Application**:
   - Use the menu displayed to interact with the library system.
   - Follow prompts for each operation.

---

## Folder Structure
```
LibraryManagementSystem/
|-- Book.java          # Defines the Book class
|-- Library.java       # Implements the library functionality
|-- LibraryManagementSystem.java # Main class to run the application
```

---

## Future Enhancements
- **Database Integration**: Store book records persistently using a relational database.
- **User Roles**: Add admin and member roles with different access levels.
- **GUI**: Develop a graphical user interface using JavaFX or Swing.
- **Advanced Search**: Add search functionality by author or genre.

---

## Author
**Sagnik Patra**

---

## License
This project is for educational purposes and is not licensed for commercial use.

