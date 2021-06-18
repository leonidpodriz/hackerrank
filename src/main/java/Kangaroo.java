public class Kangaroo {
    /**
     * HackerRank challenge: https://www.hackerrank.com/challenges/kangaroo/problem
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2 && x1 == x2) return "YES";
        if (v1 == v2) return "NO";
        if (((x2 - x1) / (v1 - v2)) <= 0) return "NO";
        if (((x2 - x1) % (v1 - v2)) != 0) return "NO";
        return "YES";
    }
}
