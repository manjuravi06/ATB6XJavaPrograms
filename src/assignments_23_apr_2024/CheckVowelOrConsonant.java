package assignments_23_apr_2024;

import java.util.Scanner;

public class CheckVowelOrConsonant {

    public static void main(String[] args) {

        System.out.println("Enter the character");

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {

            System.out.println("The entered character is a vowel : " + c);

        } else {

            System.out.println("The entered character is a consonant : " + c);

        }

    }

}
