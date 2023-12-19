package Ch10;

class Base0{
    Base0(){
        System.out.println("Hi, constructor here");
    }
    Base0(int a){
        System.out.println("Hi, constructor here with value a" + a);
    }
}
class Derived0 extends Base0{
    Derived0(){
        // super(0);
        System.out.println("Hi there derived class constructor here");
    }
    // Derived0(int x, int y){
    //     System.out.println("Hi there derived class constructor here");
    // }
}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        // Base0 b = new Base0();
        
        Derived0 d = new Derived0();
        System.out.println(d);
    }
}
