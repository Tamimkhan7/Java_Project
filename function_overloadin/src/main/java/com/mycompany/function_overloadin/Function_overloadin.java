package com.mycompany.function_overloadin;

class student {

    void sum(int a, int b) {
        int sum = a + b;
        System.out.println("summation of a and b :" + sum);
    }

    void sum(double a, double b) {
        double sum = a + b;
        System.out.println("summation of a and b :" + sum);
    }

    void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("summation of between three variable :" + sum);
    }
}

public class Function_overloadin {

    public static void main(String args[]) {
        student s = new student();
        s.sum(20, 30);
        s.sum(11.2, 50.2);
        s.sum(10, 20, 30);

    }
}
