package com.repetition_fixed.hashmap;

import java.util.HashMap;
import java.util.Map;

public class GradesCalculator {

    public GradesCalculator() {
    }


    double sum = 0;

    public void CalculateMean() {
        HashMap<Student, Grade> grades = new HashMap<>();

        grades.put(new Student("Marcin", "Chudy", 12345), new Grade(3,2,5,4.5, 5));
        grades.put(new Student("Tomasz", "Pietkun", 22335), new Grade(2,5,4,3.5, 4.5));
        grades.put(new Student("Tomasz", "Schellner", 12345), new Grade(4,4,2.5,3, 5));

        for(Map.Entry<Student,Grade> entry: grades.entrySet()) {
            System.out.println("Average grade of " + entry.getKey().getName() + " " + entry.getKey().getSurname() + " equals: " +
                    entry.getValue().getAverage());
        }

    }
}
