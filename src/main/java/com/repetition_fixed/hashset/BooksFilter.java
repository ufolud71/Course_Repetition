package com.repetition_fixed.hashset;

import java.util.HashSet;

public class BooksFilter {

    public BooksFilter() {
    }

    public void filterBooks() {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("Book1", "Author1", 1999));
        books.add(new Book("Book2", "Author2", 2001));
        books.add(new Book("Book3", "Author3", 2021));
        books.add(new Book("Book4", "Author4", 2010));

        for (Book book: books) {
            if(book.getYear() < 2010) {
                System.out.println(book.getTitle());
            }

        }
    }
}
