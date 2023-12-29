package com.mycompany.java_copy_constructor;

class student {

    int id;
    String name;
    student(int ID, String Name) {//no return type, constructor meas class name and mathod name same that are called constructor
        id = ID;
        name = Name;
    }
    student(student s1) {
        id = s1.id;
        name = s1.name;
        System.out.println("ID is : " + id);
        System.out.println("Name is : " + name);
    }
}
public class Java_copy_constructor {

    public static void main(String[] args) {
        student s1 = new student(101, "Tamim");
        student s2 = new student(s1);
    }
}
