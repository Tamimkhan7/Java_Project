package com.mycompany.overloading;
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
public class Overloading {

    public static void main(String[] args) {
        box obj = new box(10, 20, 15);
        box obj2 = new box();
        box obj3 = new box(7);
        double vol;

        vol = obj.volume();
        System.out.println("Volume of obj is : " + vol);
        vol = obj2.volume();
        System.out.println("Volume of obj2 is : " + vol);
        vol = obj3.volume();
        System.out.println("Volume of obj3 is : " + vol);
    }
}
