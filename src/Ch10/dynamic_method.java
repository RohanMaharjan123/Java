package Ch10;

class One{
    public void greet(){
        System.out.println("Ciao");
    }
    public void name(){
        System.out.println("Java");
    }
}
class Two extends One{
    public void Bonjour(){
        System.out.println("Hallo");
    }
    public void name(){
        System.out.println("OOPs");
    }
}
public class dynamic_method {
    public static void main(String[] args) {
        // One obj = new One();
        // obj.name();

        One obj = new Two(); // it is allowed 
        obj.greet();
        obj.name();

        // obj.Bonjour(); not allowed- dynamic method dispatch
        
    }
}
