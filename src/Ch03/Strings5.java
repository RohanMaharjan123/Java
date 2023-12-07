package Ch03;

public class Strings5 {
    public static void main(String[] args) {
            // String comparison
        String name1 = "Hello";
        String name2 = "Hello";
        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        // Characters are compared in ASCII code numbers
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }

        if (new String("Hello") == new String("Cello")) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
