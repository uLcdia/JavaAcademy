package com.ulcdia.experiment_6.custom_string;

public class CustomString {
    private String content;

    public CustomString(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.content;
    }
}
