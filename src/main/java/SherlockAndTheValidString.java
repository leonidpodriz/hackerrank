import java.util.*;
import java.util.stream.Collectors;

public class SherlockAndTheValidString {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
     */
    static final String YES = "YES";
    static final String NO = "NO";

    public static HashMap<Character, Integer> getCountedChars(String string) {
        HashMap<Character, Integer> countedCharacters = new HashMap<>();

        for (Character ch : string.toCharArray()) {
            countedCharacters.put(ch, countedCharacters.getOrDefault(ch, 0) + 1);
        }

        return countedCharacters;
    }

    public static String isValid(String s) {
        HashMap<Character, Integer> counting = getCountedChars(s);

        Map<Integer, List<Map.Entry<Character, Integer>>> collect = counting
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue));

        if (collect.size() == 1) return YES;
        else if (collect.size() == 2) {
            Integer[] keys = collect.keySet().toArray(new Integer[]{});
            int min = Math.min(keys[0], keys[1]);
            int max = Math.max(keys[0], keys[1]);
            int maxSize = collect.get(max).size();
            int minSize = collect.get(min).size();
            boolean isMaxSizeEqualsOne = maxSize == 1;
            boolean isMinSizeEqualsMaxMinusOne = min == (max - 1);
            boolean isMinIsOne = min == 1;
            boolean isMinSizeIsOne = minSize == 1;
            boolean isYes = isMaxSizeEqualsOne && isMinSizeEqualsMaxMinusOne || isMinIsOne && isMinSizeIsOne;

            if (isYes) return YES;
        }

        return NO;
    }
}
