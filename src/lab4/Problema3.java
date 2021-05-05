package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {
    // un sir de n elemente sortate crescator
    // se implementeaza o functie cu 2 param(un sir, un nr care sa fie cautat)
    public static void main(String[] args) {


        int myArray[] = {0, 3, 1, 6, 10, 7, 20, 40, 15, 11};
        Arrays.sort(myArray);
        System.out.println("My array ascending order: " + Arrays.toString(myArray));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you would like to search for: ");
        int number = scan.nextInt();
        CautareBinara(myArray, number);

    }

    static boolean CautareBinara(int[] sir, int number) {
        boolean a = false;
        int sol = -1;
        int Left = 0, Right = sir.length - 1;
        while (Left <= Right) {
            int Mid = (Left + Right) / 2;
            if (sir[Mid] == number) {
                a = true;
                sol = Mid;
                break;
            }
            if (sir[Mid] > number)
                Right = Mid - 1;
            if (sir[Mid] < number)
                Left = Mid + 1;
        }
        System.out.println(a);
        if (a == true)
            System.out.println("The number position is " + sol);
        return a;

    }

}