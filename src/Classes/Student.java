package Classes;

public class Student {
    String name;
    int age;
    String address;

    //Constructors
    public Student(int age, String name, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Constructors

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Here this referes to the object or property of the current class
    //Setters


    //Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }
    //Getters


    public static void main(String[] args) {
        Student srijan = new Student(21, "Srijan", "Avirampur");
        System.out.println(srijan.getName());

        srijan.setAddress("Binacinema");
        System.out.println(srijan.getAddress());
    }
}
