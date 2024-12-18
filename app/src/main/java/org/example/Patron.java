package org.example;


import java.util.ArrayList;

/**
 * The Patron class represents a library patron who can borrow and return books.
 * Each patron has a name and a list of books they have borrowed.
 */
public class Patron {
    private final String name; // The name of the patron
    private final ArrayList<Book> borrowedBooks; // List of books currently borrowed by the patron

    /**
     * Constructor to create a Patron object with a specified name.
     *
     * @param name The name of the patron.
     */
    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Allows the patron to borrow a book from the library.
     * The book is removed from the library's collection and added to the patron's borrowed books.
     *
     * @param book    The book the patron wants to borrow.
     * @param library The library from which the book is borrowed.
     */
    public void borrowBook(Book book, Library library) {
        if (library.removeBook(book.getTitle())) {
            this.borrowedBooks.add(book);
            System.out.println(this.name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available.");
        }
    }

    /**
     * Allows the patron to return a book to the library.
     * The book is removed from the patron's borrowed list and added back to the library's collection.
     *
     * @param book    The book the patron wants to return.
     * @param library The library to which the book is returned.
     */
    public void returnBook(Book book, Library library) {
        if (this.borrowedBooks.remove(book)) {
            library.addBook(book);
            System.out.println(this.name + " returned " + book.getTitle());
        } else {
            System.out.println("You don't have this book.");
        }
    }

    /**
     * Displays a list of all books currently borrowed by the patron.
     * If no books are borrowed, a message indicating so is displayed.
     */
    public void listBorrowedBooks() {
        if (this.borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : this.borrowedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }
}