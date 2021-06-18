import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        System.out.printf("%d\n%d",
                apples.stream().map(fi -> fi + a).filter(fd -> fd >= s && fd <= t).count(),
                oranges.stream().map(fi -> fi + b).filter(fd -> fd >= s && fd <= t).count()
        );
    }

    public static void main(String[] args) {
        ArrayList<Integer> apples = new ArrayList<>() {{
            add(2);
            add(3);
            add(-4);
        }};

        ArrayList<Integer> oranges = new ArrayList<>() {{
            add(3);
            add(-2);
            add(-4);
        }};
        countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }
}
