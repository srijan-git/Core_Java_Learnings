package Oops.StaticKeyword;

public class Employee {
    int emp_id;
    String name;
    static String company = "SP";

    Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    void display() {
        System.out.println("EMP_ID: " + emp_id + " Name: " + name + " Comapany: " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Srijan");
        Employee e2 = new Employee(102, "Kankana");
        e1.display();
        e2.display();

    }
}
