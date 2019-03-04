package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */



    }
    public void palindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Word :");
        String word = input.nextLine();
        word = word.toLowerCase();


        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("This word is a Palindrome");
        } else
            System.out.println("This word is not a palindrome");
    }
}
