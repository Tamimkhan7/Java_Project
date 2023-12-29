package com.mycompany.constructor;

class student {

    student(int a, String s) {
        int d = a;
        String ss = s;

        System.out.println("ID: " + d);
        System.out.println("Name: " + ss);
    }

    student(int a, int b, String Name) {
        int c = a;
        int d = b;
        String name = Name;
        System.out.println("first value : " + c);
        System.out.println("Second value: " + d);
        System.out.println("Name : " + name);
    }
}

public class Constructor {

    public static void main(String[] args) {
        student obj = new student(10, "Tamim");
        student obj2 = new student(10, 20, "Tamim");
    }
}
