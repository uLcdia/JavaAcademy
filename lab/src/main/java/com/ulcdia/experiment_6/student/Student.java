package com.ulcdia.experiment_6.student;

public class Student
{
    protected String name;
    protected int id;

    public void setStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void print() {
        System.out.println(name + ", " + id);
    }
}
