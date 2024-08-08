package wrapperClass;

// Classes Provided For Primitive Data Types
public class Example1 {
    public static void main(String[] args) {
        // int ---> Integer
        // float ---> Float
        // double --> Double
        // long ----> Long
        // byte ---> Byte
        // short ---> Short
//        String


        System.out.println("Integer MAX VALUE " + Integer.MAX_VALUE);
        System.out.println("Integer MIN VALUE " + Integer.MIN_VALUE);
        System.out.println("Integer Bytes :  " + Integer.BYTES);
        System.out.println("Binary Form Of 12 : " + Integer.toBinaryString(12));
        System.out.println("Active Bits " + Integer.bitCount(12));
        System.out.println("Octal Form of 12 : " + Integer.toOctalString(12));
        System.out.println("MSB : " + Integer.highestOneBit(9));
        System.out.println("LSB : " + Integer.lowestOneBit(9));
        System.out.println("Reverse :  " + Integer.reverse(12));
        System.out.println("Rotate Left 1 By 2 Places  " + Integer.rotateLeft(1,2));
        System.out.println("Rotate Right 1 By 2 Places  " + Integer.rotateRight(1,2));
        System.out.println("Size In Bits : " + Integer.SIZE);
        System.out.println("Parse Int : " + Integer.parseInt("1212"));

        System.out.println(Float.floatToIntBits(12.12f));
        System.out.println(Float.floatToIntBits(12.12f));

        String nums = "";
        int data = 13;
        int rem = 0;
        while (data != 0)
        {
            rem = data%2;
            nums = rem+nums;
            data = data/2;
        }
        System.out.println(nums);

        int num = 16;

        
    }
}
