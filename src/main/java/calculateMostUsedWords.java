import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class calculateMostUsedWords {

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static int countWordsUsingStringTokenizer(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    public static void FrequentWord(String array[]){
        // Insert all unique strings and update count if a string is not unique.
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (String str : array)
        {
            if (map.keySet().contains(str)) // if already exists then update count.
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1); // else insert it in the map.
        }
        // Traverse the map for the maximum value.
        String maxStr = "";
        int maxVal = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > maxVal)
            {
                maxVal = count;
                maxStr = key;
            }
            // Condition for the tie.
            else if (count == maxVal){
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }
        System.out.println("Most frequent word: "+ maxStr);
        System.out.println("Count: "+ maxVal);
    }
}
