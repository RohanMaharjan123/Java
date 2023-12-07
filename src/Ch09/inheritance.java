package Ch09;

class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("setter");
        this.x = x;
    }
    public void Print(){
        System.out.println("Constructor");
    }
}
class inherit extends Base{
    int y;
    // re-ivent a wheel method
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Creating an Object of an Base Class
        Base b = new Base();
        b.setX(2);
        System.out.println(b.getX());

        // Creating and Object of an Derived Class
        inherit i = new inherit();
        i.setY(24);
        System.out.println(i.getY());
    }
}
