package assignments_04_may_2024;

import java.util.Scanner;

public class MaxValueIn2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of ROWS for the 2D array : ");

        int rows = sc.nextInt();

        System.out.println("Enter the number of columns for the 2D array : ");

        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        int max = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.println("Enter the value for arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.println("Value of arr[" + i + "][" + j + "] : " + arr[i][j]);

                if (arr[i][j] > max) {

                    max = arr[i][j];

                }

            }
        }

        System.out.println("The maximum value in array is : " + max);

        sc.close();

    }

}
