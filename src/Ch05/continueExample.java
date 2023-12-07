package Ch5;

public class continueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipped iteration at i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
