package Ch03;
import java.util.Scanner;
public class Strings{
    public static void main(String[] args){
        String name =  new String("Gratitude");
        // String name = "Happy";
        System.out.print("Meditation of the day: ");
        System.out.println(name);
        // System.out.printf();
        // System.out.format();

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);
        sc.close();
    }
}