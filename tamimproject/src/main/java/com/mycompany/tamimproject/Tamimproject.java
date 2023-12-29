package com.mycompany.tamimproject;

class student {

    double gpa;
    String name;
    void information() {
        System.out.println("Name : " + name);
        System.out.println("GPA : " + gpa);
    }
}

public class Tamimproject {

    public static void main(String[] args) {
        student obj = new student();
        obj.gpa = 3.50;
        obj.name = "Tamim khan";
        obj.information();

    }
}
