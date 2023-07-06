package com.repetition_fixed.arraylist;

import java.util.LinkedList;

public class LinkedListCalculator {

    public LinkedListCalculator() {
    }

    public void CalculateLinkedMean() {

        LinkedList<Book> books = new LinkedList<Book>();
        books.add(new Book(1978, "Book1"));
        books.add(new Book(1990, "Book2"));
        books.add(new Book(2011, "Book3"));
        books.add(new Book(2000, "Book4"));
        books.add(new Book(1888, "Book5"));
        books.add(new Book(2002, "Book6"));

        for(Book check: books) {
            if(check.getYear() >= 2000) {
                System.out.println(check.getTitle());
            }
        }
    }
}


