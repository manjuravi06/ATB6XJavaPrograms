package assignments_25_apr_2024;

import java.util.Scanner;

public class PerformArithmeticOperations {

    public static void main(String[] args) {

        System.out.println("Enter the first number");

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        System.out.println("Enter the second number");

        int n2 = sc.nextInt();

        System.out.println("Enter the arithmetic operator");

        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println("The sum of the numbers : " + (n1 + n2));
                break;

            case '-':
                System.out.println("The difference of the numbers : " + (n1 - n2));
                break;

            case '*':
                System.out.println("The product of the numbers : " + (n1 * n2));
                break;

            case '/':
                System.out.println("The quotient of the divided numbers : " + (n1 / n2));
                break;

            case '%':
                System.out.println("The reminder of the divided numbers : " + (n1 % n2));
                break;

            default:
                System.out.println("The entered arithmetic operator in INVALID");

        }

        sc.close();

    }
}
