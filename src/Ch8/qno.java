package Ch8;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class qno {
    public static void main(String[] args) {
        Employee hari = new Employee();

        hari.setName("Maha");
        hari.salary = 200000;
        System.out.println(hari.getSalary());
        System.out.println(hari.getName());
    }
}
