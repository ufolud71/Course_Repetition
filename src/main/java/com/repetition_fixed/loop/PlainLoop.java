package com.repetition_fixed.loop;

public class PlainLoop {

    public PlainLoop() {
    }

    public void CalculateMean() {
        int[] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 12;
        numbers[2] = 3;
        numbers[3] = 42;
        numbers[4] = 22;

        int i;
        double sum = 0;
        int help;
        double mean;

        for(i = 0; i<numbers.length; i++) {
            help = numbers[i];
            sum = sum + help;
        }
        mean = sum/numbers.length;
        System.out.println(mean);
    }
}
