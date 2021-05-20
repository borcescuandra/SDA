package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {
    // un sir de n elemente sortate crescator
    // se implementeaza o functie cu 2 param(un sir, un nr care sa fie cautat)

    public static boolean binarySearch(int[] sir, int number) {
        boolean a = false;
        int position = -1;
        int lowIndex = 0, highIndex = sir.length - 1;
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (sir[midIndex] == number) {
                a = true;
                position = midIndex;
                break;
            }
            if (sir[midIndex] > number)
                highIndex = midIndex - 1;
            if (sir[midIndex] < number)
                lowIndex = midIndex + 1;
        }
        //System.out.println(a);
        if (a == true) {
            System.out.println("The index of number " + String.format("%s", number) + " is " + position);
        } else {
            System.out.println("The number " + String.format("%s", number) + " cannot be found." +
                    "");
        }
        return a;
    }

    public static void main(String[] args) {

        int myArray[] = {0, 3, 1, 6, 10, 7, 20, 40, 15, 11};
        Arrays.sort(myArray);
        System.out.println("My array ascending order: " + Arrays.toString(myArray));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you would like to search for: ");
        int number = scan.nextInt();
        binarySearch(myArray, number);

    }
}




