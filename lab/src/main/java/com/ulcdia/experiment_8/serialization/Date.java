package com.ulcdia.experiment_8.serialization;

import java.io.Serializable;

public class Date implements Serializable {
    private static final long serialVersionUID = 1L;

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public double getData() {
        return year + month + day;
    }
}
