package assignments_02_may_2024;

import java.util.Scanner;

public class TakeInputAndPrintAllTheMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array that needs to be created");

        int size = sc.nextInt();

        int[] a = new int[size];


        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter the value of " + i + " element");

            a[i] = sc.nextInt();

        }

        for (int j = 0; j < a.length; j++) {

            System.out.println("The value of " + j + " element in array is : " + a[j]);

        }

        sc.close();

    }

}
