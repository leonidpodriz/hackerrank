import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {
    @Test
    public void test1() {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;
        String kangaroo = Kangaroo.kangaroo(x1, v1, x2, v2);
        assertEquals("YES", kangaroo);
    }

    @Test
    public void test2() {
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;
        String kangaroo = Kangaroo.kangaroo(x1, v1, x2, v2);
        assertEquals("NO", kangaroo);
    }

    @Test
    public void test3() {
        int x1 = 0;
        int v1 = 4;
        int x2 = 2;
        int v2 = 0;
        String kangaroo = Kangaroo.kangaroo(x1, v1, x2, v2);
        assertEquals("NO", kangaroo);
    }

    @Test
    public void test4() {
        int x1 = 1;
        int v1 = 4;
        int x2 = 1;
        int v2 = 4;
        String kangaroo = Kangaroo.kangaroo(x1, v1, x2, v2);
        assertEquals("YES", kangaroo);
    }

    @Test
    public void test5() {
        int x1 = 0;
        int v1 = 4;
        int x2 = 5;
        int v2 = 0;
        String kangaroo = Kangaroo.kangaroo(x1, v1, x2, v2);
        assertEquals("NO", kangaroo);
    }
}