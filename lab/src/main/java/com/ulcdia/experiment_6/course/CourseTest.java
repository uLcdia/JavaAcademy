package com.ulcdia.experiment_6.course;

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Defense against the Dark Arts");
        course.addStudent("Geralt of Rivia");
        course.addStudent("Johnny Silverhand");
        course.addStudent("Jaime Lannister");
        System.out.println("Number of students: " + course.getNumberOfStudents());
        String[] students = course.getStudents();
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        Course course2 = null;
        try {
            course2 = (Course) course.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        course2.dropStudent("Geralt of Rivia");
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (String student : students2) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
