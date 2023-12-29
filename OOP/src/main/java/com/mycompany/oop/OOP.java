public class student{
    int id=101;
    string name = "Tamim khan";
    double reuslt = 3.50;
    void function(){
        System.out.println("ID"+id);
        System.out.println("Name"+name);
        System.out.println("result"+result);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        student obj = new student();
        obj.function();
    
    }
}