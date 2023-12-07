package Ch07;

public class varargs {
    static int sum(int ...arr){ //(int x, int ...arr)
        int result = 0; // result = x
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        // System.out.println("The sum of 1 is: " + sum(1));
        System.out.println("The sum of 2 and 3 is: " + sum(2,3));
        System.out.println("The sum of 2, 3 and 4 is: " + sum(2,3,4));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum(2,3,4,5));
        System.out.println("The sum of 1, 2, 3, 4 and 5 is: " + sum(1,2,3,4,5));
    }
}
