package assignments_20_apr_2024;

import java.util.Scanner;

public class GetMaxNumUsingTernaryOperator {

    public static void main(String[] args) {

        System.out.println("Enter the first number : ");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");

        int num2 = sc.nextInt();

        System.out.println("Enter the third number : ");

        int num3 = sc.nextInt();

        int result = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The greatest number is " + result);

        sc.close();

    }


}
