package Ch01;
public class literalExample {
        public static void main(String[] args) {
            int decimalValue = 42;
            int octalValue = 052;
            int hexValue = 0x2A;
            
            double decimalDouble = 3.14;
            double scientificDouble = 5.2e3;
            
            char charValue = 'A';
            String stringValue = "Hello, World!";
            
            boolean isTrue = true;
            
            String nullString = null;
            
            System.out.println("Integer literals: " + decimalValue + ", " + octalValue + ", " + hexValue);
            System.out.println("Floating-point literals: " + decimalDouble + ", " + scientificDouble);
            System.out.println("Character literal: " + charValue);
            System.out.println("String literal: " + stringValue);
            System.out.println("Boolean literal: " + isTrue);
            System.out.println("Null literal: " + nullString);
        }
    }
    
