package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("First exercise:");
        Exercise1 test = new Exercise1();
        System.out.println("t = " + test.t);
        System.out.println("y = " + test.y);

        System.out.println("Second exercise:");

        Exercise2 test1 = new Exercise2();
        System.out.println(test1.s);

        System.out.println("Next exercise:");

        Exercise3 test2 = new Exercise3();

        System.out.println(test2.i);
        System.out.println(test2.d);
        System.out.println(test2.b);

        System.out.println("Next exercise:");

        Exercise6 x = new Exercise6();
        System.out.println(x.storage("hi"));





    }
}
