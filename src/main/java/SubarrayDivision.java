import java.util.List;
import java.util.stream.IntStream;

public class SubarrayDivision {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/the-birthday-bar/problem
     */
    public static int birthday(List<Integer> s, int d, int m) {
        return (int) IntStream.range(0, s.size() - m + 1)
                .filter(i -> s.subList(i, i + m).stream().reduce(Integer::sum).orElse(0) == d)
                .count();
    }
}
