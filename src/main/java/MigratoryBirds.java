import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/migratory-birds/problem
     */
    public static int migratoryBirds(List<Integer> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .map(i -> Map.entry(i.getKey(), i.getValue().size()))
                .collect(Collectors.groupingBy(Map.Entry::getValue))
                .entrySet()
                .stream().max(Comparator.comparingInt(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .flatMap(
                        entries -> entries.stream()
                                .min(Comparator.comparingInt(Map.Entry::getKey))
                                .map(Map.Entry::getKey)
                )
                .orElse(0);
    }
}
