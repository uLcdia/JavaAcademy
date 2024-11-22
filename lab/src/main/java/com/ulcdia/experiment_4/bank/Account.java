package com.ulcdia.experiment_4.bank;

import java.time.LocalDateTime;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private final LocalDateTime dateCreated;

    // Constructors
    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = LocalDateTime.now();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    // Getters and setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    // Main
    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12.0;
    }

    public boolean withdraw(double amount) {
        validateNonNegative(amount);
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double amount) {
        validateNonNegative(amount);
        balance += amount;
    }

    // Validation
    private void validateNonNegative(double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
    }
}
