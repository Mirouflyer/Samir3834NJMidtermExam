package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        System.out.println(s.length());
        String [] largerWord = s.split(" ");


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";



        return map;
    }

}
