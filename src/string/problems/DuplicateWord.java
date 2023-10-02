package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Remove punctuation and convert to lowercase
        st = st.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = st.split("\\s+");

// Find duplicate words and their occurrences
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            if (words[i] != null) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = null;
                    }
                }
                if (count > 1) {
                    System.out.println("Word: " + words[i] + ", Occurrences: " + count);
                }
            }
        }

        // Calculate the average length of words

        double totalLength = 0;
        int nonNullWordsCount = 0;

        for (String word : words) {
            if (word != null) {
                totalLength += word.length();
                nonNullWordsCount++;
            }
        }

        double averageLength = totalLength / nonNullWordsCount;

        System.out.println("Average Word Length: " + averageLength);
    }
}
