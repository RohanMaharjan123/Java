package Ch4;
import java.util.Scanner;
public class switchc {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 20:
                System.out.println("You are going to Graduate!");
                break;
            case 23:
                System.out.println("You are going to join a JOB!");
                break;
            case 29:
                System.out.println("You are going to Married");
                break;
            case 60:
                System.out.println("You are going to get retired");
            default:
                System.out.println("Enjoy your life!");
        }
        /*
        Enhanced Switch Case
        switch(var){
            case 18 ->{
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case 20 -> System.out.println("You are going to Graduate!");
            default -> System.out.println("Enjoy Your Life");
        }
         */
        sc.close();
    }
}
