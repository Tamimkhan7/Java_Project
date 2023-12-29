package com.mycompany.tamimsecond;

import java.util.Scanner;

class student {
    double gpa;
    String name;

    void information() {
        System.out.println("Name : " + name);
        System.out.println("GPA : " + gpa);
    }
}

public class Tamimsecond {

    public static void main(String[] args) {
        student obj = new student();
        Scanner x = new Scanner(System.in);

        System.out.print("Enter your name : ");
        obj.name = x.nextLine();

        System.out.print("Enter your gpa : ");
        obj.gpa = x.nextDouble();

        obj.information();
    }
}
