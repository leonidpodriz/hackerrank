import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MigratoryBirdsTest {
    @Test
    void test1() {
        assertEquals(3, MigratoryBirds.migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    @Test
    void test2() {
        assertEquals(4, MigratoryBirds.migratoryBirds(List.of(1, 4, 4, 4, 5, 3)));
    }
    @Test
    void test3() {
        assertEquals(1, MigratoryBirds.migratoryBirds(List.of(1, 1, 2, 2, 3)));
    }
}