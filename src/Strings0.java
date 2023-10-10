public class Strings0{
    public static void main(String[] args){
        String name = "ruchi";
        System.out.print("The name is: ");
        System.out.println(name);
        
        int a = 6;
        float b = 5.6454f;
        // System.out.printf("The value of a is %d and value of b is %f", a, b);
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        // System.out.format("The value of a is %d and value of b is %f", a, b);
        System.out.format("The value of a is %d and value of b is %.2f", a, b);
    }
}