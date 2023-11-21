package Ch7;

public class Functions4 {
    public static void main(String[] args) {
        // String Concatenation
        String firstname = "Marcus";
        String lastname = "Aurelius";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        // ChatAt
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
