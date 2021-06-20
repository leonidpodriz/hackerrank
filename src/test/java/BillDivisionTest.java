import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillDivisionTest {
    @Test
    void test1() {
        assertEquals("5", BillDivision.bonAppetit(new Integer[]{3, 10, 2, 9}, 1, 12));
    }

    @Test
    void test2() {
        assertEquals("Bon Appetit", BillDivision.bonAppetit(new Integer[]{3, 10, 2, 9}, 1, 7));
    }
}