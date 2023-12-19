package Ch10;

class OneClass{
    int a;
    public int getA(){
        return a;
    }
    OneClass(int u){
        this.a = u;
    }
    public int returnone(){
        return 1;
    }
}
class TwoClass extends OneClass{
    TwoClass(int c){
        super(c);
        System.out.println("A constructor");
    }
}
public class this_super {
    public static void main(String[] args) {
        OneClass o = new OneClass(5);
        TwoClass t = new TwoClass(15);
        System.out.println(o.getA());
        System.out.println(t);
    }
}
