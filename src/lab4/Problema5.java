package lab4;
import java.util.Scanner;
import java.util.Random;

public class Problema5 {

    static final int Fx = 3;
    static final int Fy = 3;

    private static void printMatrix(int[][] matrix, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;

        System.out.println("Enter the number of rows: ");
        n = scan.nextInt();
        System.out.println("Enter the number of columns: ");
        m = scan.nextInt();
        System.out.println();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               matrix[i][j] = new Random().nextInt(255);
            }
        }
        System.out.println("Matrix before filter: ");
        printMatrix(matrix, n, m);

        // aplicare filtru Fx x Fy (3 x 3)
        for (int i = 0; i < n; i = i + Fy) {
            for (int j = 0; j < m; j = j + Fx) {
                int maxFx = Math.min(Fx, m - j);
                int maxFy = Math.min(Fy, n - i);
                int sum = 0;
                for (int k = 0; k < maxFy; k++) {
                    for (int l = 0; l < maxFx; l++) {
                        sum += matrix[i + k][j + l];
                    }
                }
                int average = (int) sum / (maxFx * maxFy);
                for (int k = 0; k < maxFy; k++) {
                    for (int l = 0; l < maxFx; l++) {
                        matrix[i + k][j + l] = average;
                    }
                }

            }
        }
        System.out.println();
        System.out.println("Matrix after filter:");
       printMatrix(matrix, n, m);
    }
}
