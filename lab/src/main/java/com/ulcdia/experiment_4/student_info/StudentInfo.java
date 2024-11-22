package com.ulcdia.experiment_4.student_info;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentInfo {
    private String name;
    private int id;
    private int age;
    private Map<Subject, Double> score;

    // Constructors
    public StudentInfo(String name, int id, int age, Map<Subject, Double> score) {
        if (score == null) {
            this.score = Stream.of(Subject.values())
                                .collect(Collectors.toMap(Function.identity(), s -> 0.0));
        } else {
            this.score = score;
        }
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    public StudentInfo(String name, int id, int age) {
        this(name, id, age, null);
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<Subject, Double> getScore() {
        return this.score;
    }

    public void setScore(Map<Subject, Double> score) {
        this.score = score;
    }

    public double getScore(Subject subject) {
        return this.score.get(subject);
    }

    public void setScore(Subject subject, double score) {
        this.score.put(subject, score);
    }

    // Main
    public double getScoreSum() {
        return this.score.values().stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public double getScoreMean() {
        return (this.getScoreSum() / this.score.size());
    }

    public double getScoreMin() {
        return this.score.values().stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(0.0);
    }

    public double getScoreMax() {
        return this.score.values().stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
    }

    // Print
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("StudentInfo: \n");
        stringBuilder.append(" " + "ID: " + this.getId() + '\n');
        stringBuilder.append(" " + "Name: " + this.getName() + '\n');
        stringBuilder.append(" " + "Age: " + this.getAge() + '\n');

        stringBuilder.append(" " + "Scores: \n");
        for (Subject subject : Subject.values()) {
            stringBuilder.append("  ");
            stringBuilder.append(subject.toString());
            stringBuilder.append(": ");
            stringBuilder.append(this.score.get(subject));
            stringBuilder.append('\n');
        }

        stringBuilder.append(" " + "Stats: \n");
        stringBuilder.append("  " + "Sum: " + this.getScoreSum() + '\n');
        stringBuilder.append("  " + "Mean: " + this.getScoreMean() + '\n');
        stringBuilder.append("  " + "Max: " + this.getScoreMax() + '\n');
        stringBuilder.append("  " + "Min: " + this.getScoreMin() + '\n');

        return stringBuilder.toString();
    }
}
