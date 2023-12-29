package com.mycompany.static_keyword_java;

class student {
    int roll;
    String name;
    static String university = "Prime University";

    student(int r, String n) {
        roll = r;
        name = n;
    }
    void display() {
        System.out.print(roll);
        System.out.print(" " + name);
        System.out.print(" " + university);
        System.out.println();
    }
}
public class Static_keyword_java {
    public static void main(String[] args) {
        student s1 = new student(111, "CSE 59D A");
        student s2 = new student(222, "CSE 59D B");

        s1.display();
        s2.display();
    }
}


//class A2{
//    static{
//        System.out.println("Static block is invoked");
//    }
//    public static void main(String args[]){
//        System.out.println("Hello main");
//    } 
//}