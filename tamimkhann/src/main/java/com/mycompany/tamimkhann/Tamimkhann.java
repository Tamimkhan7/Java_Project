package com.mycompany.tamimkhann;//package and main class name both are same

class Calculate {

    Calculate(int a, int b) {//constructor a return type thake na
        int c = a;
        int d = b;
        System.out.println("First value : " + c);//constructor a value print kore dicci
        System.out.println("Second value : " + d);

    }
}
public class Tamimkhann {

    public static void main(String[] args) {
        Calculate obj = new Calculate(10, 20);
    }
}
