package string.problems;

public class Anagram {


        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

    public boolean areAnagrams(String str1, String str2) {

        // Convert both input strings to lowercase
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // Check if the lengths of both strings are not equal
            if (str1.length() != str2.length()) {
                return false;
            }

            int[] charCount = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                charCount[str1.charAt(i) - 'a']++;
                charCount[str2.charAt(i) - 'a']--;
            }

            for (int count : charCount) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }
    }
