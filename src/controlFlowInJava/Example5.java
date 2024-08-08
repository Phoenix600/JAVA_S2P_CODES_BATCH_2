package controlFlowInJava;

// Bitwise Operators
public class Example5 {
    public static void main(String[] args)
    {
        int x = 10;
        int y = 6;
        int result = 0;

        result = x & y;
        System.out.println("x & y : " + result); // 2

        result = x | y;
        System.out.println("x | y : " + result);

        result = x ^ y;
        System.out.println("x ^ y : " + result);

        int data = 1; // 0 0 0 0 0 0 1
        result = data << 1; // 0 0 0 0 0 1 0
        System.out.println("data << 1 : " + result);

        result = data << 2; // 0 0 0 0 0 1 0 0
        System.out.println("data << 2 : " + result);

    }
}
