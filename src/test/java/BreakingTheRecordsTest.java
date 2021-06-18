import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheRecordsTest {
    @Test
    void test1() {
        ArrayList<Integer> scores = new ArrayList<>() {{
            add(3);
            add(4);
            add(21);
            add(36);
            add(10);
            add(28);
            add(35);
            add(5);
            add(4);
            add(42);
        }};
        List<Integer> breakingRecords = BreakingTheRecords.breakingRecords(scores);
        assertEquals(4, breakingRecords.get(0));
        assertEquals(0, breakingRecords.get(1));
    }
    @Test
    void test2() {
        ArrayList<Integer> scores = new ArrayList<>() {{
            add(10);
            add(5);
            add(20);
            add(20);
            add(4);
            add(5);
            add(2);
            add(25);
            add(1);
        }};
        List<Integer> breakingRecords = BreakingTheRecords.breakingRecords(scores);
        assertEquals(2, breakingRecords.get(0));
        assertEquals(4, breakingRecords.get(1));
    }

    @Test
    void test3() {
        ArrayList<Integer> scores = new ArrayList<>() {{
            add(0);
        }};
        List<Integer> breakingRecords = BreakingTheRecords.breakingRecords(scores);
        assertEquals(0, breakingRecords.get(0));
        assertEquals(0, breakingRecords.get(1));
    }
}