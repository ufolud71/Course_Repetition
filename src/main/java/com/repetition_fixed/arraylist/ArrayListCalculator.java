package com.repetition_fixed.arraylist;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCalculator {

    public ArrayListCalculator() {
    }

    public void calculateArrayMean() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(2);

        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);

        for(int i = 0; i < arrayList.size();i++) {
            if(arrayList.get(i) == max || arrayList.get(i) == min) {
                arrayList.remove(i);
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println("------------------------------------");


        int sum = 0;
        double mean;

        for(Integer grades: arrayList) {
            sum = sum + grades.intValue();
        }
        for(Integer check: arrayList) {
            System.out.println(check);
        }

        System.out.println(sum);
        mean = sum/arrayList.size();
        System.out.println(mean);
    }
}
