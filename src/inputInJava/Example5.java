package inputInJava;

import java.io.File;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args)throws Exception {
        File file = new File("D:\\Code\\Java\\java_batch_2\\src\\inputInJava\\Data.txt");
        Scanner Input = new Scanner(file);

        while (Input.hasNext())
        {
            System.out.println(Input.nextLine());
        }
    }
}
