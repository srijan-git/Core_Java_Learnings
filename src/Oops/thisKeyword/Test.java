package Oops.thisKeyword;

public class Test {
    private int emp_id; //Instance variable

    void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
        //"this refers to the instance variable and which refers to the object"
    }

    int getEmp_id() {
        return emp_id;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setEmp_id(10);
        System.out.println("The Employee ID is: " + t.getEmp_id());
    }
}
