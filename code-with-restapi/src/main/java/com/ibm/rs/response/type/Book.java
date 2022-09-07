package com.ibm.rs.response.type;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    private String ISBN;
    private String name;
    private String author;

    public Book() {
    }

    public Book(String ISBN, String name, String author) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
