package Ch8;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class qno{
    public static void main(String[] args) {
        Employee Josh = new Employee();
        Josh.setName("Josh Arthur");
        System.out.println(Josh.getName());
    }
}