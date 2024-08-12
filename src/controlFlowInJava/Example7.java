package controlFlowInJava;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] array)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Integer Data : ");
        int x = Input.nextInt(); // "12ABC"

        if(x%2 == 0)
        {
            System.out.println("Even Number");
        }
        System.out.println("X is a real number : "+ x);
        System.out.println("The value of X  : " + x);

    }
}
