package com.repetition_fixed.stack;

import java.util.ArrayDeque;

public class BookStacker {

    public BookStacker() {
    }

    public void stack() {
        Book book1 = new Book("Book1", "Author1", 1999);
        Book book2 = new Book("Book2", "Author2", 2023);
        Book book3 = new Book("Book3", "Author3", 2010);
        Book book4 = new Book("Book4", "Author4", 1989);
        Book book5 = new Book("Book5", "Author5", 2001);

        ArrayDeque<Book> theStack = new ArrayDeque<>();
        theStack.push(book1);
        theStack.push(book2);
        theStack.push(book3);
        theStack.push(book4);
        theStack.push(book5);

        System.out.println(theStack.size());

        Book lastBook = theStack.peekLast();

        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.pop();

        System.out.println(theStack.size());

        System.out.println("Last book in the stack: " + lastBook.getTitle());

    }
}
