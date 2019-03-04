package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a word :");
        String word = input.nextLine();

        word=word.toLowerCase();
        int a = word.length();
        Permutation permutation = new Permutation();
        permutation.permute(word,0,a-1);



    }

    private void permute(String word,int l,int r){
        if(l==r){
            System.out.println(word);
        }else
        {
            for (int i = l; i <= r; i++)
            {
                word = swap(word,l,i);
                permute(word, l+1, r);
                word = swap(word,l,i);
            }

        }
    }

    public String swap (String j, int k,int p){
        char temp ;
        char [] charArray = j.toCharArray();
        temp = charArray[k];
        charArray[k]=charArray[p];
        charArray[p]=temp;
        return String.valueOf(charArray);
    }
}
