import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/sock-merchant/problem
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        return ar.stream()
                .collect(Collectors.groupingBy(Function.identity()))
                .values()
                .stream()
                .map(integers -> integers.size() / 2)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
