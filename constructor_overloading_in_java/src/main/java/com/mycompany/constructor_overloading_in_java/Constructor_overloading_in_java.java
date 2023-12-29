package com.mycompany.constructor_overloading_in_java;

class student {

    int id;
    String name;
    double result;

    student(int Id, String Name) {
        id = Id;
        name = Name;
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);

    }

    student(int Id, double res, String Name) {
        id = Id;
        result = res;
        name = Name;
        System.out.println("My id is : " + id);
        System.out.println("My result is : " + result);
          System.out.println("My result is : " + name);

    }
}

public class Constructor_overloading_in_java {

    public static void main(String[] args) {
        student s1 = new student(10, "Tamim");
        student s2 = new student(20, 3.50, "Tamim");
    }
}
