package com.ulcdia.experiment_5.my_integer;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(5);
        System.out.println(myInteger.getNumber());
        System.out.println(myInteger.isEven() ? "Even" : "Not Even");
        System.out.println(myInteger.isOdd() ? "Odd" : "Not Odd"); // Duplicate
        System.out.println(myInteger.isPrime() ? "Prime" : "Not Prime");    
    }
}
