package Oops.Encapsulation;

public class Employee {
    private int emp_id; //Data hiding

    public void setEmp_id(int emp_id1) { //Setter
        emp_id = emp_id1;
    }

    public int getEmp_id() { //Getter
        return emp_id;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmp_id(20);
        int result = emp.getEmp_id();
        System.out.println("Employee ID is: " + result);
    }
}
