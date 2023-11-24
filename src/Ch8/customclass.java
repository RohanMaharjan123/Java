package Ch8;

class Bird{
    int weight;
    String color;
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("Custom Class");

        Bird crow = new Bird(); // Initializing a Object
        crow.weight = 15;
        crow.color = "black";
        System.out.println(crow.weight + " " + crow.color);
    }
}
