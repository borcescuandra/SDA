package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        //sir de 10 nr intregi
        //se citeste o pozitie intre 0 si 9 si se sterge acea pozitie

        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scan = new Scanner(System.in);
        int position = -1;
        System.out.println("Enter a number between 0 and 9 to set: ");
        while (position < 0 || position > 9) {
            while(!scan.hasNextInt()) {
                scan.next();
            }
            System.out.println("Please enter a number between 0 and 9: ");
            position = scan.nextInt();
        }

        int n = myArray.length-1;
        for (int i = position; i < n; i++) {
            myArray[i] = myArray[i+1];
        }

        myArray[n] = 0;
        System.out.println(Arrays.toString(myArray));

    }
}
