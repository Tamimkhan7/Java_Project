package com.mycompany.class_define_second;

class Student { // Class name should start with an uppercase letter

    Student() { // This is a constructor, not a method
        int id = 101;
        String name = "Tamim Khan";
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}
 class Class_define_second {

    public static void main(String[] args) {
       Student obj = new Student();
    }
}
