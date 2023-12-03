package Ch9;

class MyCSEmployee{
    private int id;
    private String name;

    public MyCSEmployee(){
        id = 45;
        name = "clara";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class constructors {
    public static void main(String[] args) {
        MyCSEmployee homas = new MyCSEmployee();
        // homas.setName("Homasiuous");
        // homas.setId(2);
        System.out.println(homas.getName());
        System.out.println(homas.getId());
    }
}
