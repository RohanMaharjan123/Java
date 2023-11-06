package Java.Java.Patterns_in_Java.Basic_Patterns;

public class Patterns6 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        // Outer loop
        for(int i = 1; i <= n; i++){
            // inner loop for printing spaces
            for(int j =1; j<=i; j++){
                System.out.print(number+ " ");
                number++; //number = number + 1;
            }
            System.out.println();
        }
    }
}
