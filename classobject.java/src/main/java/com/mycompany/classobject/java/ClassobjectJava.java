package com.mycompany.classobject.java;

import java.util.Scanner;

class student {
    int age;
    String name, city;
    void information() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(city);
    }
}
public class ClassobjectJava {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        student obj = new student();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        obj.name = input.nextLine();
        System.out.print("Enter your city : ");
        obj.city = input.nextLine();
        System.out.print("Enter your age : ");
        obj.age = input.nextInt();
        obj.information();

    }
}
