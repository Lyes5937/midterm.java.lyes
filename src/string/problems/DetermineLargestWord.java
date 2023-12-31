package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        int maxLength = wordNLength.keySet().iterator().next();
        String longestWord = wordNLength.get(maxLength);

        System.out.println(maxLength + " " + longestWord);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //implement
        String st = "";
        int maxLength = 0;
        String[] words = wordGiven.split("\\s+");

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                st = word;
            }
        }


        map.put(maxLength, st);
        return map;
    }
}
