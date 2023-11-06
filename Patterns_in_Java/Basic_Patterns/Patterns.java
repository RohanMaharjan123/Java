package Java.Java.Patterns_in_Java.Basic_Patterns;
public class Patterns{
    public static void main(String[] args) {
        // Solid Rectangle
        int n = 4;
        int m = 5;

        // Outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}