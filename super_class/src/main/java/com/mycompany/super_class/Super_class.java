package com.mycompany.super_class;

class student {
    String color = "White";
}
class teacher extends student{
    String color = "Black";

    void printcolor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Super_class {

    public static void main(String[] args) {
        teacher obj = new teacher();
        obj.printcolor();
    }
}
