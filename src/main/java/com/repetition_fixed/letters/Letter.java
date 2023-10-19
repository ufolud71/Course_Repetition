package com.repetition_fixed.letters;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class Letter {
    public Letter() {
    }

    Random randomGenerator = new Random();

    //generating 50 Strings with random amount of characters and adding them to ArrayDeque
    public ArrayDeque generateLetters(){
        String a = "a";
        ArrayDeque<String> arrayOfLetters = new ArrayDeque<>();
        for (int i = 0; i <= 50; i++) {
            int howMany = randomGenerator.nextInt(50);
            String word = "";
            for (int n = 0; n <= howMany; n++) {
                word = word += a;
            }
            arrayOfLetters.add(word);
        }
        for (String array: arrayOfLetters) {
            System.out.println(array);
        }
        return arrayOfLetters;
    }
    //Splitting elements of ArrayDeque into two ArrayLists based on their length
    public void sortArray(ArrayDeque<String> theQueue) {
        theQueue = generateLetters();
        ArrayList<String> even = new ArrayList<>();
        ArrayList<String> uneven = new ArrayList<>();
        for (String string: theQueue) {
            if(string.length() % 2 == 0) {
                even.add(string);
            } else {
                uneven.add(string);
            }
        }
        //printing out contents of both Arraylists
        System.out.println("Contents of ArrayList with even numbers of characters:");
        for (String look: even) {
            System.out.println(look);
        }
        System.out.println("Contents of ArrayList with uneven numbers of characters:");
        for (String look: uneven) {
            System.out.println(look);
        }
    }
}
