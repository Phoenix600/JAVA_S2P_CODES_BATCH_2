package controlFlowInJava;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args)
    {
//        Scanner Input = new Scanner(System.in);
        Scanner KeyBoard = new Scanner(System.in);

        int x = 12;
        System.out.println("[+]Enter the value of A : ");
        int a;
        a = KeyBoard.nextInt();

        String data = (a == 15)?"Pranay":"Mukul";
        System.out.println(data);
    }

}
