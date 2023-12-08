package Ch10;

class Base0{
    Base0(){
        System.out.println("Hi, constructor here");
    }
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
class Derived0 extends Base0{
    Derived0(){
        System.out.println("Hi there derived class constructor here");
    }
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        // Base0 b = new Base0();
        Derived0 d = new Derived0();
    }
}
