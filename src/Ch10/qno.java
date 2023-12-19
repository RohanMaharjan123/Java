package Ch10;
class Circle{
    public int radius;
    Circle(){
        System.out.println("i am not parameterized circle");
    }
    Circle(int r){
        System.out.println("Parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("Parametrized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    
}
public class qno {
    public static void main(String[] args) {
        // objects
        Circle objc = new Circle(9);
        Cylinder obj = new Cylinder(12, 6);
    }
}
