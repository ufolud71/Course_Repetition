package com.repetition_fixed.speedTest;

import java.util.HashMap;
import java.util.LinkedList;

public class SpeedTest {

    public void linkedListTest() {
        //Creating LinkedList and filling it up with 7000 elements
        LinkedList<Book> books = new LinkedList<>();
        for(int i = 1; i <= 7000; i++) {
            Book book = new Book("Author" + i, "Title" + i);
            books.add(book);
        }
        //Printing out the size of LinkedList
        System.out.println("There are " + books.size() + " books in the LinkedList");

        //Removing first element of LinkedList and calculating processing time
        long begin = System.nanoTime();
        books.remove(books.get(0));
        long end = System.nanoTime();
        //Printing out the results
        System.out.println("Deleting first element of LinkedList lasts: " + (end - begin) + "ns");

        //Removing last element of LinkedList and calculating processing time
        begin = System.nanoTime();
        books.remove(books.get(books.size() - 1));
        end = System.nanoTime();
        //Printing out the results
        System.out.println("Deleting last element of Linked list lasts: " + (end - begin) + "ns");
    }

    public void hashMapTest() {
        //Creating HashMap and filling it with 7000 elements
        HashMap<String, Book> books = new HashMap<>();
        for (int i = 1; i <= 7000; i++) {
            Book book = new Book("Author" + i, "Title" + i);
            books.put("Book" + i, book);
        }
        //Checking the size of HashMap
        System.out.println("There are " + books.size() + " books in the HashMap");

        //Getting chosen element of HashMap and calculating processing time
        long begin = System.nanoTime();
        books.get("Book4325");
        long end = System.nanoTime();
        //Printing out the results
        System.out.println("Getting chosen element of HashMap lasts: " + (end - begin) + "ns");

        //Removing and adding chosen element of HashMap and calculating processing time
        begin = System.nanoTime();
        books.remove("Book4325");
        books.put("Book4325", new Book("Author4325", "Title4325"));
        end = System.nanoTime();
        //Printing out the results
        System.out.println("Removing and adding chosen element of HashMap lasts: " + (end - begin) + "ns");
    }
}

