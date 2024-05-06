package assignments_04_may_2024;

import java.util.Scanner;

public class Transpose2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of ROWS for the 2D array : ");

        int rows = sc.nextInt();

        System.out.println("Enter the number of columns for the 2D array : ");

        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        int[][] transposeArr = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.println("Enter the value for arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.println("Value of arr[" + i + "][" + j + "] : " + arr[i][j]);


            }
        }

        for (int i = 0; i < columns; i++) {

            for (int j = 0; j < rows; j++) {

                transposeArr[i][j] = arr[j][i];

            }

        }

        for (int i = 0; i < columns; i++) {

            for (int j = 0; j < rows; j++) {

                System.out.println("Value of transposed array transposeArr[" + i + "][" + j + "] : " + transposeArr[i][j]);

            }

        }

        sc.close();

    }


}
