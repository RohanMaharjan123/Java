package Ch02;
public class Op_Precedence {
    public static void main(String[] args){
        //  JAVA doesnt use BODMAS use but it used precedence for calculation

        // Precedence & Associativity
        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are evaluated on the basis of left to right associativity.
        = 30-34/2
        =30-17
        =13
         */
        int b = 60/5-34*2;
        /*
        = 12-34/2
        =12-68
        =-56
         */
        System.out.println(a);
        System.out.println(b);

    }
}
