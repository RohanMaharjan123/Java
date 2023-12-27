package Ch10;

abstract class Parent{
    public Parent(){
        System.out.println("constructor of Base0");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
} 
abstract class Child0 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstractprogram {
    public static void main(String[] args) {
        Child c = new Child();
        // Child0 c0 = new Child0(); -- error 
    }
}
