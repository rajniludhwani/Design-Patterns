package com.java.design.patterns;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(100, "abc"),
                new Book(200, "def"),
                new Book(300, "ghi"),
                new Book(400, "jkl")
        );
        Library lib = new Library(bookList);
        Iterator itr = lib.createIterator();
        while(itr.hasNext()) {
            Book book = (Book)itr.next();
            System.out.println(book.getBookName() + " costs " + book.getPrice());
        }
    }
}