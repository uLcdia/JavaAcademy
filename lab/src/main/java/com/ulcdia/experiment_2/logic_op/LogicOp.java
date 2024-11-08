package com.ulcdia.experiment_2.logic_op;

public class LogicOp {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c = 6;
        boolean d,e,f,g;

        d = !(a > b);               // false
        e = (a > b) && (a > c);     // true
        f = (a > b) || (a > c);     // true
        g = (a > b) && !(a > c);    // false
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        boolean h = (b >= c);       //true
        boolean i = (b <= c);       //true
        boolean j = (a == b);       //false

        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }    
}
