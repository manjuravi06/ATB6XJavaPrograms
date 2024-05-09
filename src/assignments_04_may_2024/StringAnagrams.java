package assignments_04_may_2024;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");

        String s1 = sc.nextLine().toLowerCase();

        System.out.println("Enter the second string : ");

        String s2 = sc.nextLine().toLowerCase();

        if (s1.length() == s2.length()) {

            char[] c1 = s1.toCharArray();

            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean flag = true;

            for (int i = 0; i < c1.length; i++) {

                if (c1[i] != c2[i]) {

                    flag = false;
                    break;

                }

            }

            if (flag) {

                System.out.println("The Strings are Anagram");

            } else {

                System.out.println("The Strings are NOT Anagram");

            }

        } else {

            System.out.println("The Strings cannot be used to compare Anagram");

        }

    }

}
