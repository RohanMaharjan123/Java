package Ch05;

public class breakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop terminated at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
