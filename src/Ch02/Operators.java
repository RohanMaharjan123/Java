package Ch02;
public class Operators {
    public static void main(String[] args){
        int a = 4;
        // int b = 6 + a;

        // assignment operators
        int b = 9, c;
        b += 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b); // Arithmetic Operator
        c = b - a; //Assignment Operator
        System.out.println(c);
        System.out.println(64>6); // Comparison Operators
        System.out.println(64>5 && 64>8); //Logical Operators
        System.out.println(2&3); //bit wise operators
    }

}
