

package com.mycompany.function_overriding;

class parent{
    void print(){
        System.out.println(" I am a from parent class");
    }
}
class sub extends parent{
    void print(){
        System.out.println("I am a from sub class");
    }
}
public class Function_overriding {

    public static void main(String[] args) {
        sub obj = new sub();
        obj.print();
    }
}
