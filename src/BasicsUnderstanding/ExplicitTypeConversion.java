package BasicsUnderstanding;

public class ExplicitTypeConversion {
    //In simple words we are trying to store a larger ranging variable into a smaller ranging variable
    public static void main(String[] args) {

        double a = 50.5089;
        System.out.println("Double representation: " + a);

        float f = (float) a;
        System.out.println("Float representation: " + f);

        long b = (long) a;
        System.out.println("Long representation: " + b);

        int c = (int) b;
        System.out.println("Int representation: " + c);

    }
}
