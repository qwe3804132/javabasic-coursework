package com.busyqa.coursework.wk2_tips;

public class Book {

    /* Instance Variables */

    private String title;
    private Author author;
    private double price;

    /* Constructor */
    public Book(String title, String authorFirstName, String authorLastName, double price) {
        this.author = new Author(authorFirstName, authorLastName);
        this.title = title;
        this.price = price;
    }

    /* Methods */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return this.title + " by " + this.author.getFirstName() + " " + this.author.getLastName() + " for $" + this.price;
    }
}
