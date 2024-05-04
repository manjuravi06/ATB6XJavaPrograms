package assignments_02_may_2024;

import java.util.Scanner;

public class FindMaxSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter the value of " + i + " element");

            a[i] = sc.nextInt();

        }

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < a.length; j++) {

            if (a[j] > max) {

                max = a[j];

            }

        }

        System.out.println("The maximum salary is : " + max);

        sc.close();

    }

}
