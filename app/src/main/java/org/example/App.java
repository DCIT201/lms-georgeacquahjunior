/*
 * This should be your main class where all your objects will be created
 */
package org.example;

/**
 * The App class serves as the entry point of the application.
 * It demonstrates the functionality of the Library, Book, and Patron classes.
 */
public class App {

    /**
     * Default constructor for the App class.
     */
    public App() {
    }

    /**
     * Provides a greeting message.
     *
     * @return A "Hello World!" message.
     */
    public String getGreeting() {
        return "Hello World!";
    }

    /**
     * The main method is the starting point of the application.
     * It demonstrates:
     * - Creating a Library instance and adding books.
     * - Listing books in the library.
     * - A Patron borrowing and returning books.
     * - Displaying books before and after operations.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println((new App()).getGreeting());

        // Create a Library instance and add books to it
        Library library = new Library();
        library.addBook(new Book("A teacher's salary", "Joseph Acheampong", 2024));
        library.addBook(new Book("Data Structures", "Jane Smith", 1949));

        // Display the books currently in the library
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a Patron instance and perform borrowing operations
        Patron patron = new Patron("Alice");
        patron.borrowBook(new Book("A teacher's salary", "Joseph Acheampong", 2024), library);

        // Display the books borrowed by the patron
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Patron returns a borrowed book
        patron.returnBook(new Book("A teacher's salary", "Joseph Acheampong", 2024), library);

        // Display the books in the library after borrowing and returning
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}
