package BasicsUnderstanding;

public class ImplecitDataTypeConversion {
    //In simple word we are storing smaller range variable into larger range variable
    public static void main(String[] args) {
        int a = 100;
        System.out.println("Int representation: " + a);
        long b = a;
        System.out.println("Long representation: " + b);
        float c = b;
        System.out.println("FLoat representation: " + c);
    }
}
