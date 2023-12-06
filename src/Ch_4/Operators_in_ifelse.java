package Ch4;

public class Operators_in_ifelse {
    public static void main(String[] args){
        System.out.println("For Logical And....");
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        System.out.println("For Logical Or....");
        if (a || b) {
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        System.out.println("For Logical NOT....");
        System.out.println("NOT(A) is");
        System.out.println(!a);
        System.out.println("NOT(B) is");
        System.out.println(!b);
    }
}
