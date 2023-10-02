package string.problems;

public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String input = "ABC";
        generatePermutations(input.toCharArray(), 0);
    }

    public static void generatePermutations(char[] str, int index) {
        if (index == str.length - 1) {
            System.out.println(new String(str));
        } else {
            for (int i = index; i < str.length; i++) {

                char temp = str[index];
                str[index] = str[i];
                str[i] = temp;


                generatePermutations(str, index + 1);

                temp = str[index];
                str[index] = str[i];
                str[i] = temp;
            }
        }
    }
}
