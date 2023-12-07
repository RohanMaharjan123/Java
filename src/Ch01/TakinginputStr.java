package Ch01;
import java.util.Scanner;
public class TakinginputStr {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user to enter their name
        System.out.print("Enter your name: ");
        // Read the input as a string
        String name = scanner.nextLine();
        
        // Prompt for user to enter their age
        System.out.print("Enter your age: ");
        // Read the input as an integer
        int age = scanner.nextInt();
        
        // Display a greeting message with the provided information
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
}

}
