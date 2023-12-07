package Ch09;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 2;
        this.breadth = 3;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}
public class qno1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12,15);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        System.out.println("Area of the rectangle is: " + r.area());
        System.out.println("Perimeter of the rectangle is: " + r.perimeter());
    }
}
