package wrapperClass;

public class Example3 {
    public static void main(String[] args) {
//        System.out.println(Boolean.TYPE);
//        System.out.println(Boolean.getBoolean(""));

        System.setProperty("demo-1","true");
        System.setProperty("demo-2","1234");
        /**
         * JAVA MEMORY
         *  {
         *  "demo-1" : "true",
         *  "demo-2"  : "1234"
         *  "j12"   : "0xffd500"
         *
         *  }
         *
         *
         *
         */

        String systemVariable = System.getProperty("demo-1");
        System.out.println(systemVariable);

        var result =  Boolean.getBoolean("demo-1");
        System.out.println( "Result : "+ result);
    }
}
