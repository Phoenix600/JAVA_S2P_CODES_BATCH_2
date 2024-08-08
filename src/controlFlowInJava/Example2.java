package controlFlowInJava;

public class Example2 {
    public static void main(String[] args)
    {
        int a = 12;
        int b = 13;
        int c = 12;

        boolean result = a==b;
        System.out.println("A==B : " + result);

        result = a != b;
        System.out.println("A!=B : " + result);

        result = a < b;
        System.out.println("A<B : " + result);

        result = a > b;
        System.out.println("A>B : " + result);

        result = a >= b;
        System.out.println("A>=B :" + result);

        result = a<=b;
        System.out.println("A<=B : " + result);

    }
}
