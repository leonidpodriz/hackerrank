import java.util.Arrays;
import java.util.List;

public class BillDivision {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/bon-appetit/problem
     */
    public static String bonAppetit(Integer[] bill, int k, int b) {
        return Arrays
                .stream(bill)
                .reduce(Integer::sum)
                .map(i -> b - (i - bill[k]) / 2)
                .map(i -> i == 0 ? "Bon Appetit" : String.valueOf(i))
                .orElse("0");
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        System.out.println(bonAppetit(bill.toArray(new Integer[0]), k, b));
    }
}
