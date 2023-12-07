package Ch04;
import java.util.*;
public class conditions1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == y){
            System.out.println("Equal");
        }else if (x > y) {
                System.out.println("x is greater");                
        }else{
                System.out.println("x is lesser");
        }
        sc.close();
    }
}
