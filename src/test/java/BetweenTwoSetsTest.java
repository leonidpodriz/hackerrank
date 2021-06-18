import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {
    @Test
    void test1() {
        ArrayList<Integer> list1 = new ArrayList<>() {{
            add(2);
            add(4);
        }};
        ArrayList<Integer> list2 = new ArrayList<>() {{
            add(16);
            add(32);
            add(96);
        }};
        assertEquals(3, BetweenTwoSets.getTotalX(list1, list2));
    }

    @Test
    void test2() {
        ArrayList<Integer> list1 = new ArrayList<>() {{
            add(2);
            add(6);
        }};
        ArrayList<Integer> list2 = new ArrayList<>() {{
            add(24);
            add(36);
        }};
        assertEquals(2, BetweenTwoSets.getTotalX(list1, list2));
    }
}