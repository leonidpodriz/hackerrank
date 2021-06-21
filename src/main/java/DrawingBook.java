public class DrawingBook {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/drawing-book/problem
     */
    public static int pageCount(int n, int p) {
        int fromFront = 1 + (p - 1) / 2 - (p % 2);
        int fromBack = n / 2 - fromFront;

        return Math.min(fromBack, fromFront);
    }
}
