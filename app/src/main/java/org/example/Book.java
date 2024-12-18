package org.example;

/**
 * The Book class represents a book with a title, author, and publication year.
 * It provides constructors for creating book instances and methods to retrieve the book's details.
 */
public class Book {
    private String title; // The title of the book
    private String author; // The author of the book
    private int yearPublished; // The year the book was published

    /**
     * Default constructor for the Book class.
     * Creates a book instance with uninitialized fields.
     */
    public Book() {
    }

    /**
     * Parameterized constructor for the Book class.
     * Allows the creation of a book with specified details.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Retrieves the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Retrieves the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Retrieves the year the book was published.
     *
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return this.yearPublished;
    }
}
