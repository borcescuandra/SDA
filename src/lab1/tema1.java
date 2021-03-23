package lab1;

import java.util.Scanner;

//exercitii de la curs
public class tema1 {

    private static Scanner sc;

    public static void main(String[] args)
    {
        //exercitiul 1
        // sir de n numere, sa se printeze nr. maxim
        int sir[] = {23, 13, 56, 12, -12, 34, 57, -2};

        //rezultat 57

        int max = 0;
        max = sir[0];
        int k;
        for(k=0; k < sir.length; k++) {
            if (sir[k] > max)
                max = sir[k];
        }

        System.out.println("Numarul maxim: " + max);
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        //exercitiul 2
        //matrice nxn, calculati suma de pe diagonala principala
        //311
        //151
        //118
        //rezultat: 16

        int i, j, rows, columns, sum = 0;

        sc= new Scanner(System.in);

        System.out.println("Introduceti numarul de randuri si coloane:");
        rows = sc.nextInt();
        columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Introduceti elementele matricii:");
        for(i = 0; i < rows; i++) {
            for(j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < matrix.length ; i++)
        {
            System.out.println("Elementul de la pozitia " + i + "," + i + " = " + matrix[i][i]);
            sum = sum + matrix[i][i];
        }
        System.out.println("Suma elementelor de pe diagonala principala = " + sum);





    }
}

