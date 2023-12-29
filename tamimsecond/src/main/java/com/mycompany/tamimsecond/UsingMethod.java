package com.mycompany.tamimsecond;

import java.util.Scanner;

class Student { // Class name should start with an uppercase letter

    double id;
    String name;

    void information() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

public class UsingMethod {

    public static void main(String[] args) {
        Student obj = new Student(); // Create an instance of the Student class
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter name : ");
            obj.name = input.nextLine();
            System.out.println("Enter your id :");
            obj.id = input.nextDouble();
            // Consume the newline character
            input.nextLine();
            obj.information();
            // Close the scanner to release resources (optional)
        }
    }
}
