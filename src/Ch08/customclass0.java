package Ch08;

class Employee{
    int id;
    int salary;
    String name;
    public void  printDetails(){
        System.out.println("My id "+ id);
        System.out.println( "and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class customclass0 {
    public static void main(String[] args) {
        System.out.println("This is my Custom Class");

        Employee jonas = new Employee(); // Initializing a Object
        Employee lukas = new Employee();
        jonas.id = 1;
        jonas.name = "Mc";
        jonas.salary = 35000;
        lukas.id = 2;
        lukas.name = "sheer";

        jonas.printDetails();
        int salary = jonas.getSalary();
        System.out.println(salary);
        lukas.printDetails();

    }
}
