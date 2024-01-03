package Ch11;

interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("sound of horn");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed up");
    }
}
public class interface0 {
    public static void main(String[] args) {
        AvonCycle cycle0 = new AvonCycle();
        cycle0.applyBrake(1);
        // You cannot modify the properties in Interfaces as they are final
    }
}
