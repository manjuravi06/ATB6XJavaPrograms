package assignments_04_may_2024;

import java.util.Scanner;

public class RemoveDuplicateCharInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = sc.nextLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            boolean flag = true;

            for (int j = 0; j < result.length(); j++) {

                if (result.charAt(j) == s.charAt(i)) {

                    flag = false;
                    break;

                }

            }

            if (flag) {

                result.append(s.charAt(i));

            }

        }

        System.out.println("The result string is : " + result);

        sc.close();

    }

}
