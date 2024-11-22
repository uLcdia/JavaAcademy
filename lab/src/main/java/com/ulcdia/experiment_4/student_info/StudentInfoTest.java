package com.ulcdia.experiment_4.student_info;

import java.util.HashMap;

public class StudentInfoTest {
    public static void main(String[] args) {
        // Creating a StudentInfo object using the first constructor
        StudentInfo student1 = new StudentInfo("Max Caulfield", 1001, 18); 

        // Setting individual scores.
        student1.setScore(Subject.CS, 85.5);
        student1.setScore(Subject.MATH, 92.0);
        student1.setScore(Subject.ENGLISH, 78.0);

        System.out.println(student1);

        // Creating a StudentInfo object using the second constructor with a pre-populated HashMap
        HashMap<Subject, Double> scores = new HashMap<>();
        scores.put(Subject.CS, 90.0);
        scores.put(Subject.MATH, 88.0);
        scores.put(Subject.ENGLISH, 95.0);

        StudentInfo student2 = new StudentInfo("Chloe Price", 1002, 19, scores);
        System.out.println(student2);
    }
}