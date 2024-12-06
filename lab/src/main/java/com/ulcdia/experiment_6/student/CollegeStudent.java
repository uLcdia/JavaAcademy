package com.ulcdia.experiment_6.student;

public class CollegeStudent extends Student {
    private String major;
    private String className;

    public void setCollegeStudent(String name, int id, String major, String className) {
        setStudent(name, id);
        this.major = major;
        this.className = className;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(major + ", " + className);
    }
}
