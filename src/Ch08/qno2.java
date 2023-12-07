package Ch08;

class Rectangle{
    int length,breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length + breadth);
    }
}
public class qno2{
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.length = 5;
        rc.breadth =6;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}