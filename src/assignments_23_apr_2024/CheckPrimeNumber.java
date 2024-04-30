package assignments_23_apr_2024;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 1) {

            System.out.println("1 is nether prime nor composite");

        }

        if (num > 1) {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {

                    System.out.println("The entered number is composite : " + num);
                    break;

                } else {

                    System.out.println("The entered number is prime : " + num);
                    break;

                }


            }


        }

    }

}
