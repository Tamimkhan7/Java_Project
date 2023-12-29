class student{
    static int age;
   static void display() {
       System.out.println("Static Method");
   }
}
public class Demo {
 
   public static void main(String[] args) {

      student obj = new student();
       age = 30;
       System.out.println("Age is " + obj.age);

       // access the static method
       obj.display();
   }
}