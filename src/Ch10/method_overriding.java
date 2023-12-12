package Ch10;

class A{
    public int a;
    public int hi(){
        return 4;
    }
    public void meth1(){
        System.out.println("2nd method of A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("2nd method of B");
    }
    public void meth2(){
        System.out.println("3rd method of B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
