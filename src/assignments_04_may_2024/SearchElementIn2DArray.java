package assignments_04_may_2024;

import java.util.Scanner;

public class SearchElementIn2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of ROWS for the 2D array : ");

        int rows = sc.nextInt();

        System.out.println("Enter the number of columns for the 2D array : ");

        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.println("Enter the value for arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter the element to search : ");
        int search = sc.nextInt();
        boolean flag = false;

        int rowPosition = 0, colPosition = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (arr[i][j] == search) {

                    rowPosition = i;
                    colPosition = j;
                    flag = true;

                }

            }
        }

        if (flag) {

            System.out.println("Element is " + search + " present at arr[" + rowPosition + "][" + colPosition + "]");

        } else {

            System.out.println("The searched element " + search + " is not present");
        }

        sc.close();

    }

}
