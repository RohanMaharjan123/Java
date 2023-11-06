package Java.Java.Patterns_in_Java.Basic_Patterns;

public class Patterns2 {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for(int i = n; i >= 1; i--){
            // inner loop
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
