package lab1;

import java.util.Scanner;

public class tema1_2 {

    private static Scanner scan;

    public static void main(String []args) {

        int x, y;
        int sum, difference, product, max, min;
        double distance, average;

        scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        x = scan.nextInt();
        y = scan.nextInt();

        sum = x + y;
        difference = x - y;
        product = x * y;
        average = sum / 2;
        distance = Math.abs(x - y);

        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

        System.out.println("Input first integer = " + x);
        System.out.println("Input second integer = " + y);
        System.out.println("Sum =  " + sum);
        System.out.println("Difference =  " + difference);
        System.out.println("Product =  " + product);
        System.out.println("Minimum =  " + min);
        System.out.println("Maximum =  " + max);
        System.out.println("Average =  " + average);
        System.out.println("Distance  =  " + distance);

    }


}
