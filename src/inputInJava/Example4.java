package inputInJava;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // Body Mass Index
        float height;
        float weight;
        float bmi;

        Scanner Input = new Scanner(System.in);

        System.out.println("[+]Enter your height in m  : ");
        height = Input.nextFloat();
        height = height*height;

        System.out.println("[+]Enter your weight in kgs :");
        weight = Input.nextFloat();

        bmi = weight/height;

        System.out.printf("Your BMI %f ",bmi);

    }
}
