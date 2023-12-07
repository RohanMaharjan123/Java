package Ch09;

class Cylinder{
    private int radius;
    private int height;
     // Constructor
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
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
    public double volume(){
        return  Math.PI * Math.pow(radius,2) * height;
    }
    public double perimeter(){
        return 2 * Math.PI * radius + 2 * height;
    }
    public double totalSurfaceArea(){
        return 2 * Math.PI * radius *(radius + height);
    }
}
public class qno0 {
    public static void main(String[] args) {
        Cylinder  myCylinder = new Cylinder(7,12);
        // Printing the height and radius of Cylinder
        // myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        // myCylinder.setRadius(7);
        System.out.println(myCylinder.getRadius());

        // double volume = Math.PI * Math.pow(myCylinder.getRadius(), 2) * myCylinder.getHeight();
        // double perimeter = 2 * Math.PI * myCylinder.getRadius() + 2 * myCylinder.getHeight();
        // double totalSurfaceArea = 2 * Math.PI * myCylinder.getRadius() * (myCylinder.getRadius() + myCylinder.getHeight());

        System.out.println("Volume of the cylinder is: " + myCylinder.volume());
        System.out.println("Perimeter of the cylinder is: " + myCylinder.perimeter());
        System.out.println("Total Surface Area of the cylinder is: " + myCylinder.totalSurfaceArea());
    }
}
