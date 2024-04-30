package assignments_23_apr_2024;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        System.out.println("Enter the first number : ");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");

        int num2 = sc.nextInt();

        System.out.println("Enter the third number : ");

        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {

            System.out.println("The first number is the largest : " + num1);

        } else if (num2 >= num3 && num2 >= num3) {

            System.out.println("The second number is the largest : " + num2);

        } else {

            System.out.println("The third number is the largest : " + num3);

        }

        sc.close();

    }

}
