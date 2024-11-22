package com.ulcdia.experiment_4.bank;

public class AccountTest {
    public static void main(String[] args) {
        Account capitalTwo = new Account(1122, 20000.0);
        capitalTwo.setAnnualInterestRate(0.045);
        capitalTwo.withdraw(2500.0);
        capitalTwo.deposit(3000.0);
        
        System.out.println("CapitalTwo: " + '\n' +
                           "Balance: " + capitalTwo.getBalance() + '\n' +
                           "Monthly interest rate: " + capitalTwo.getMonthlyInterestRate() + '\n' +
                           "Creation time: " + capitalTwo.getDateCreated());
    }
}
