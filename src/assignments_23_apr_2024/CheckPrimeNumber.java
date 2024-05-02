package assignments_23_apr_2024;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean b = true;

        if (num <= 1) {

            System.out.println("The entered number is not a prime number");

        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {

                    System.out.println("The entered number is composite : " + num);

                    b = false;

                    break;

                }

            }

            if (b) {

                System.out.println("The entered number is a prime number : " + num);

            }

        }

    }

}
