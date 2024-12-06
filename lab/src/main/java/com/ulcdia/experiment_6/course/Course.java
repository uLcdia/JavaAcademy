package com.ulcdia.experiment_6.course;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                students[i] = null;
                numberOfStudents--;
            }
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course course = (Course) super.clone();
        course.students = students.clone();
        return course;
    }
}
