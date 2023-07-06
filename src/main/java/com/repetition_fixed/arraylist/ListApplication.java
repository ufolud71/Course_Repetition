package com.repetition_fixed.arraylist;

public class ListApplication {
    public static void main(String[] args) {

        ArrayListCalculator arrayListCalculator = new ArrayListCalculator();
        arrayListCalculator.calculateArrayMean();
        LinkedListCalculator linkedListCalculator = new LinkedListCalculator();
        linkedListCalculator.CalculateLinkedMean();
    }
}
