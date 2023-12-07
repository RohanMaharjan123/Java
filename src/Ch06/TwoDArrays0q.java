package Ch06;
import java.util.Scanner;

public class TwoDArrays0q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input: Matrix Elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input: Search Element
        System.out.print("Enter the value to search for: ");
        int searchValue = sc.nextInt();

        // Search and Print Locations
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == searchValue) {
                    System.out.println(searchValue + " found at locations (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(searchValue + " not found in the matrix.");
        }

        // Close Scanner
        sc.close();
    }
}
