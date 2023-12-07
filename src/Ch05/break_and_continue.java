package Ch5;

public class break_and_continue {
    public static void main(String[] args) {
        // Break and Continue in Loops
        int i = 0;
        do {
            i++;
            if (i==2) {
                System.out.println("Ending the loop");
                continue; //break;
            }
            System.out.println(i);
            System.out.println("Hi!");
        } while (i<5);
        System.out.println("statement ends here.");
    }
}
