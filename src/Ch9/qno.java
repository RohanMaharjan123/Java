package Ch9;

class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

}
public class qno {
    public static void main(String[] args) {
        Cylinder  myCylinder = new Cylinder();
        // Printing the height and radius of Cylinder
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(7);
        System.out.println(myCylinder.getRadius());

        double volume = Math.PI * Math.pow(myCylinder.getRadius(), 2) * myCylinder.getHeight();
        double perimeter = 2 * Math.PI * myCylinder.getRadius() + 2 * myCylinder.getHeight();

        System.out.println("Volume of the cylinder is: " + volume);
        System.out.println("Perimeter of the cylinder is: " + perimeter);
    }
}
