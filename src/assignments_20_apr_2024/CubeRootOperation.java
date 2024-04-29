package assignments_20_apr_2024;

import java.util.Scanner;

public class CubeRootOperation {

    public static void main(String[] args) {

        System.out.println("Enter the value of x : ");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println("Enter the value of y : ");

        int y = sc.nextInt();

        System.out.println("Enter the value of z : ");

        int z = sc.nextInt();

        double result = Math.cbrt((Math.pow(x, 2)) + (Math.pow(y, 2)) - (Math.abs(z)));

        System.out.println("The cube root of the expression is " + result);

        sc.close();

    }
}
