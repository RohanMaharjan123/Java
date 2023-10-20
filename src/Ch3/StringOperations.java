public class StringOperations {
    public static void main(String[] args) {
        // Declare and initialize strings
        String str1 = "Hello, ";
        String str2 = "World!";
        
        // Concatenation of strings
        String result = str1 + str2;
        System.out.println("Concatenated String: " + result);
             // Length of a string
            int length = result.length();
            System.out.println("Length of the String: " + length);
            
             // Extracting substring
            String substring = result.substring(0, 5);
            System.out.println("Substring: " + substring);
            
             // Uppercase and lowercase conversion
            String uppercase = result.toUpperCase();
            String lowercase = result.toLowerCase();
            System.out.println("Uppercase: " + uppercase);
            System.out.println("Lowercase: " + lowercase);
            
             // Checking if a string contains a specific substring
            boolean contains = result.contains("Hello");
            System.out.println("Contains 'Hello': " + contains);
            
             // Checking if two strings are equal
            String anotherString = "Hello, World!";
            boolean isEqual = result.equals(anotherString);
            System.out.println("Is equal to 'Hello, World!': " + isEqual);
    }
}