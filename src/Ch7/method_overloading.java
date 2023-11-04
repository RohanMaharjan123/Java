package Ch7;

public class method_overloading {
    static void Joke(){
        System.out.println("Ciao, Buongiorno");
    }
    static void change(int a){
        a = 99;
    }
    static void change1(int [] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        Joke();

        // Case 1: Changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change method is: " + x);

        // Case 2: Changing the Array
        int [] marks ={50, 55, 40, 45, 57};
        change1(marks);
        System.out.println("The value of x after running change1 method is: " + marks[0]);
    }
}
