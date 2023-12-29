package com.mycompany.constructor_overloading_java;

class box {

    double width, height, depth;

    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    box() {
        width = height = depth = 0;
    }

    box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Constructor_overloading_java {

    public static void main(String[] args) {
        box obj = new box(10, 20, 30);
        box obj2 = new box();
        box obj3 = new box(7);
        double vol;

        vol = obj.volume();
        System.out.println("First box : " + vol);

        vol = obj2.volume();
        System.out.println("scond box : " + vol);

        vol = obj3.volume();
        System.out.println("third box : " + vol);
    }
}
