package Java.Patterns_in_Java.Basic_Patterns;

public class Patterns0 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // Outer Loop
        for(int i = 1; i<=n; i++){
            // inner loop
            for(int j = 1; j<=m; j++){
                // cell -> (i,j) rows and column
                if(i == 1 || j == 1 || i == n|| j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
