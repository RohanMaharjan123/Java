package Ch03;

public class Strings6 {
    public static void main(String[] args) {
        // Compare
        String sentence = "Hi its me I'm the problem it's me.";
        // substring(beginning index, ending index)
        String name = sentence.substring(10, sentence.length());
        System.out.println(name);

        // Strings are immutable
    }
}
