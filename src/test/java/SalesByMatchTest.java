import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest {
    @Test
    void test1() {
        assertEquals(3, SalesByMatch.sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    @Test
    void test2() {
        assertEquals(2, SalesByMatch.sockMerchant(7, List.of(1, 2, 1, 2, 1, 3, 2)));
    }
}