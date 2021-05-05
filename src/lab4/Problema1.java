package lab4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Problema1 {
    // un sir de nr intregi cu 10 elemente
    // se citeste de la tastatura o pozitie 0-9 si un numar care se adauga pe acea pozitie

    public static void main(String[] args) {

        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList myNewArray = new ArrayList();

        for (int i = 0; i < myArray.length; i++) {
            myNewArray.add(myArray[i]);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number between 0 and 9 to set: ");
        int position = -1;
        while (position < 0 || position > 9) {
            while (!scan.hasNextInt()) {
                scan.next();
            }
            System.out.println("Please choose a number between 0 and 9: ");
            position = scan.nextInt();
        }
        System.out.println("Enter an integer: ");
        int myInt = scan.nextInt();

        myNewArray.add(position, myInt);
        System.out.println("Using ArrayList ->" + myNewArray);

// **********************************************************************************

        int copy[] = new int[11];
        for(int i=0; i < myArray.length; i++) {
            copy[i] = myArray[i];
        }

        int n = copy.length;
        for (int j = n-2; j >= position; j--)
            copy[j+1] = copy[j];

        copy[position] = myInt;
        myArray = copy;
        System.out.println(Arrays.toString(copy));
} }
