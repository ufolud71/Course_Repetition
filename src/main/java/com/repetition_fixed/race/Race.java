package com.repetition_fixed.race;

import java.util.Random;

public class Race {
    public Race() {
    }

    public void starRace() {
        int sumA = 1000;
        int sumB = 0;
        int loopIterator = 0;
        Random randomGenerator = new Random();

        while(sumA > sumB) {
            int randomA = randomGenerator.nextInt(10);
            int randomB = randomGenerator.nextInt(50);
            sumA = sumA + randomA;
            sumB = sumB + randomB;
            loopIterator++;
            System.out.println("Loop number: " + loopIterator + " - Suma A = " + sumA + ", Suma B = " + sumB);

        }
    }
}
