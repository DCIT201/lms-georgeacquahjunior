package org.example;

import java.util.ArrayList;

/**
 * The Library class represents a library with a collection of books.
 * It provides methods to add, remove, and list books.
 */
public class Library {
    private final ArrayList<Book> books = new ArrayList<>(); // List to store the books in the library

    /**
     * Constructor to create a new Library object.
     * Initializes the books list.
     */
    public Library() {
    }

    /**
     * Returns the list of books currently in the library.
     *
     * @return The list of books in the library.
     */
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    /**
     * Adds a new book to the library's collection.
     *
     * @param book The book to be added to the library.
     */
    public void addBook(Book book) {
        this.books.add(book);
    }

    /**
     * Removes a book from the library's collection based on its title.
     * If the book is not found, the method returns false.
     *
     * @param book The title of the book to be removed.
     * @return false, indicating the book was not removed successfully.
     */
    public boolean removeBook(String book) {
        this.books.remove(book); // Removes the book by title
        return false; // Currently always returns false (may need to fix this logic)
    }

    /**
     * Displays a list of all the books currently available in the library.
     * If the library has no books, a message indicating so is displayed.
     */
    public void listBooks() {
        if (this.books.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : this.books) {
                System.out.println(book.getTitle()); // Prints each book's title
            }
        }
    }
}
