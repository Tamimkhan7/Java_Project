package com.mycompany.tamimsecond;

import java.util.Scanner;

class Student {

    double id;
    String name;

    void information() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);

    }
}

public class using_method {

    public static void main(String[] args) {
        Student obj = new Student();

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter name : ");
        obj.name = input.nextLine();

        System.out.println("Enter you id :");
        obj.id = input.nextDouble();
        input.nextLine();
        obj.information();
    }
}
