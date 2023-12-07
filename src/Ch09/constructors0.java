package Ch09;

class MyBIEmployee {
    private int id;
    private String name;

    public MyBIEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructors0 {
    public static void main(String[] args) {
        MyBIEmployee homas = new MyBIEmployee("Cicero", 2);
        // homas.setName("Homasiuous");
        // homas.setId(2);
        System.out.println(homas.getName());
        System.out.println(homas.getId());
    }
}
