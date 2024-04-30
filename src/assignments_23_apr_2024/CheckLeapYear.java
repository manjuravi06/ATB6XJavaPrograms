package assignments_23_apr_2024;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        System.out.println("Enter the year : ");

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

            System.out.println("The entered year is a leap year : " + year);

        } else {

            System.out.println("The entered year is not a leap year : " + year);

        }

        sc.close();

    }

}
