package Ch1;
import java.util.Scanner;
public class Takinginputin {
    public static void main(String[] args){
    System.out.println("Checking input from user");
    Scanner sc = new Scanner(System.in);

    boolean b1 = sc.hasNextInt();
    System.out.println(b1);

    sc.close();
    }
}
