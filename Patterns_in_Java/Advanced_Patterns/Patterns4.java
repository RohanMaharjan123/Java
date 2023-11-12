package Java.Patterns_in_Java.Advanced_Patterns;
public class Patterns4 {
        public static void main(String[] args) {
            int n = 5; // Change this value to adjust the size of the rhombus
    
            for (int i = 1; i <= n; i++) {
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
    
                for (int k = 1; k <= n; k++) {
                    if (i == 1 || i == n || k == 1 || k == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

