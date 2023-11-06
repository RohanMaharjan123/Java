package Java.Java.Patterns_in_Java.Basic_Patterns;

public class Patterns5 {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop
        for(int i = 1; i <= n; i++){
            // inner loop for printing spaces
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
