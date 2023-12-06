package Ch9;

class MyEmployee{
    private int id;
    private String name;

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
public class Access {
    public static void main(String[] args) {
        MyEmployee hari = new MyEmployee();
        // hari.id = 100;
        // hari.name = "Hari bansha Acharaya"; --> provides error due to private access modifier
        hari.setName("Hari bansha Acharaya");
        System.out.println(hari.getName());
        hari.setId(2);
        System.out.println(hari.getId());
    }
}
