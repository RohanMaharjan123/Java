package Java.Java.Patterns_in_Java.Basic_Patterns;

public class Patterns7 {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop
        for(int i = 1; i <= n; i++){
            // Inner Loop
            for(int j =1; j <= i; j++){
                int sum = i+j;
                if(sum %2 == 0){ //Even
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
