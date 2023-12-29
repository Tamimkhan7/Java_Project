package com.mycompany.final_keyword;
final class student {//this is final class 
    int id;
    final void display(int ID) {//final mathod
        id = ID;
        System.out.println("This is my id : " + id);
        System.out.println("This is a final method");
    }
}
public class Final_keyword {

    public static void main(String[] args) {
        student obj = new student();
        obj.display(10);
    }
}
