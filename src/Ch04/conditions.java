package Ch04;
import java.util.*;
public class conditions {
    public static void main(String[] args){
        // IF else condition in Javas
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not an Adult");
        }
        sc.close();
    }
}
