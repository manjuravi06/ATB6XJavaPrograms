package assignments_23_apr_2024;

import java.util.Scanner;

public class PositiveAndNegativeNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {

            System.out.println("The entered number is Positive");

        } else if (num < 0) {

            System.out.println("The entered number is Negative");

        } else {

            System.out.println("The entered number is Zero");

        }

        sc.close();

    }

}
