package arrays;

import java.util.*;

public class WordFrequency {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String[] data = in.nextLine().split(" ");
            List<String> words = Arrays.asList(data);
            Map<String, Integer> wordFrequencies = WordFrequency.getWordFrequencies(words);
            System.out.println(wordFrequencies);

        }

        public static Map<String, Integer> getWordFrequencies(List<String> words) {
            Map<String, Integer> wordFrequencies = new LinkedHashMap<String, Integer>();
            if (words != null) {
                for (String word : words) {
                    if (word != null) {
                        word = word.trim();
                        if (!wordFrequencies.containsKey(word)) {
                            wordFrequencies.put(word, 0);
                        }
                        int count = wordFrequencies.get(word);
                        wordFrequencies.put(word, ++count);
                    }
                }
            }
            return wordFrequencies;
        }
}
