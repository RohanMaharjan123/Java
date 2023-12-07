package Ch07;

public class method_overloading_0 {
    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("Good Morning" + a + "Friend");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning" + a + "Friend");
        System.out.println("Good Morning" + b + "Friend");
    }
    public static void main(String[] args) {

        // Method Overloading
        foo();
        foo(1);
        foo(1,2);
        // Arguments are actual!
    }
}
