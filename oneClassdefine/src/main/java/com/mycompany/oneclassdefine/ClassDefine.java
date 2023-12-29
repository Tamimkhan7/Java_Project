package com.mycompany.oneclassdefine;

class Student { // Class name should start with an uppercase letter

    Student() { // This is a constructor, not a method
        int id = 101;
        String name = "Tamim Khan";
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}
public class ClassDefine {
    public static void main(String[] args) {
        Student obj = new Student(); // Creating an instance of the Student class, which will invoke the constructor
    }
}
