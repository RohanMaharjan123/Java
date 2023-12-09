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
public class this_super {
    public static void main(String[] args) {
        OneClass o = new OneClass(5);
        System.out.println(o.getA());
    }
}
