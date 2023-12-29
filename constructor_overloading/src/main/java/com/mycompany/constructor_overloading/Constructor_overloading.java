package com.mycompany.constructor_overloading;

class student {//one class define

    student(int a, String s) {//first object class define
        int d = a;
        String ss = s;
        System.out.println("ID " + d);
        System.out.println("Name : " + ss);
    }

    student(int a, int b) {//second obeject class define
        int c = a;
        int d = b;
        int sum = a + b;
        System.out.println("First value " + c);
        System.out.println("Sirst value " + d);
        System.out.println("Sum value " + sum);
    }
}

public class Constructor_overloading {

    public static void main(String[] args) {
        student obj = new student(10, "Tamim");
        student obj2 = new student(15, 20);
    }
}
/**/