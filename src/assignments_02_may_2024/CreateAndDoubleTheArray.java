package assignments_02_may_2024;

import java.util.Scanner;

public class CreateAndDoubleTheArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter the value for " + i + " element");

            a[i] = sc.nextInt();

        }

        int[] b = new int[size];

        for (int j = 0; j < b.length; j++) {

            b[j] = a[j] * 2;

        }

        for (int x = 0; x < b.length; x++) {

            System.out.println("The value of a[" + x + "] : " + a[x]);

            System.out.println("The value of b[" + x + "] : " + b[x]);

        }

        sc.close();

    }

}
