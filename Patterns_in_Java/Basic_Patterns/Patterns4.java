package Java.Patterns_in_Java.Basic_Patterns;

public class Patterns4 {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop
        for(int i = 1; i <= n; i++){
            // inner loop for printing spaces
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
