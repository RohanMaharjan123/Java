package Ch8;

class Bird{
    int weight;
    String color;
    public void  printDetails(){
        System.out.println("Bird is "+ color + "in color");
        System.out.println( "Bird " + weight + "kg in weight");

    }
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("Custom Class");

        Bird crow = new Bird(); // Initializing a Object
        Bird sparrow = new Bird();
        crow.weight = 15;
        crow.color = "black";
        sparrow.weight = 1;
        sparrow.color = "brown";

        crow.printDetails();
        sparrow.printDetails();

    }
}
