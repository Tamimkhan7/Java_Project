package com.mycompany.overriding_super_class;

class Animal {//ai class ke ami extend koreci dog class dara

    void display() {//aita amar extend class ar method
        System.out.println("I am a animal");
    }
}

class dog extends Animal {//aita ami class extend korteci

    void display() {//extend amar main class ar method
        System.out.println("I am a dog");
    }

    void printmessage() {//this is my calling method
        
        display();//this is my present class method calling 
        super.display();//this is extend class method calling
    }
}

public class Overriding_super_class {

    public static void main(String[] args) {
        dog obj = new dog();
        obj.printmessage();
    }
}
