package Ch1;
import java.util.Scanner;
public class TakinginputS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}


