import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int bmp = 0;
        int blp = 0;
        int hs = scores.get(0);
        int ls = hs;

        for (Integer score : scores) {
            if (score > hs) {
                hs = score;
                bmp++;
            } else if (score < ls) {
                ls = score;
                blp++;
            }
        }

        return List.of(bmp, blp);
    }
}
