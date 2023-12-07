package Ch3;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'C');
        System.out.println(sb);

        sb.insert(0, 'S');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);
    }
}
