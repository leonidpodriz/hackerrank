import java.util.List;
import java.util.stream.IntStream;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        return (int) IntStream
                .range(1, b.get(0) + 1)
                .filter(pf -> a.stream().allMatch(i -> pf % i == 0))
                .filter(pf -> b.stream().allMatch(i -> i % pf == 0))
                .count();
    }
}
