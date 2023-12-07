package Ch07;

public class methods0 {
    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c;
        // Methods invocations using Object creation
        methods0 obj = new methods0();
        c = obj.logic(a, b);
        System.out.println(c);
    }
}
