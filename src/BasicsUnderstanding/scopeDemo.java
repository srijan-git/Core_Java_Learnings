package BasicsUnderstanding;

public class scopeDemo {
    public static void main(String[] args) {
        {
            //Local Scope
            int x = 10;
            System.out.println("X is in local Scope: " + x);
        }
        //Global Scope
        //We cannot do this
        // System.out.println("Global Value of x: " + x);
    }

}
