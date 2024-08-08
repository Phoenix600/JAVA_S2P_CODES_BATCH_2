package wrapperClass;

public class Example2 {
    public static void main(String[] args) {
        /**
         * Boolean value :
         * Enquiry Methods
         * is()
         * has()
         * contains()
         */
        System.out.println(Float.isFinite(0.0f/12));
        System.out.println(Float.isInfinite(12f/0));
        float x1 = (float)(1212f + 1212.12);
        System.out.println(Float.isNaN(x1));
        System.out.println(Float.toHexString(12.12f));
        System.out.println(Float.MAX_EXPONENT);
    }
}
