package com.ulcdia.experiment_2.relation_op;

public class RelationOp {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c = 6;

        boolean d = (a > b);            // true
        boolean e = (a < b);            // false
        boolean f = (b == c);           // true
        boolean g = (b != c);           // false

        f = ((b == c) || (a < b));      // true
        g = ((b == c) && (a < b));      // false

        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
    }
}
