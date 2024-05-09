package assignments_04_may_2024;

import java.util.Scanner;

public class ReverseTheString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String s = sc.nextLine();

        StringBuilder reversedString = new StringBuilder();

        for (int i = (s.length() - 1); i >= 0; i--) {

            reversedString.append(s.charAt(i));

        }

        System.out.println("The reversed string : " + reversedString);

        sc.close();

    }

}
