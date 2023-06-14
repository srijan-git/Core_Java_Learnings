package Oops.Polymorphism.MethodOverriding;

class Test2{
    void show(){
        System.out.println("Test2");
    }
}

public class Test extends Test2{
    @Override
    void  show(){
        System.out.println("Test");
    }
    public static void main(String[] args) {
        Test t1=new Test();
        t1.show();//Overridden method will show output
        Test2 t2 =new Test2();
        t2.show();
    }
}
