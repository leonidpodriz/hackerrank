import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayDivisionTest {
    @Test
    void test1() {
        List<Integer> s = List.of(1, 1, 1, 1, 1, 1);
        int d = 3;
        int m = 2;
        assertEquals(0, SubarrayDivision.birthday(s, d, m));
    }

    @Test
    void test2() {
        List<Integer> s = List.of(4);
        int d = 4;
        int m = 1;
        assertEquals(1, SubarrayDivision.birthday(s, d, m));
    }

    @Test
    void test3() {
        List<Integer> s = List.of(1, 2, 1, 3, 2);
        int d = 3;
        int m = 2;
        assertEquals(2, SubarrayDivision.birthday(s, d, m));
    }
}