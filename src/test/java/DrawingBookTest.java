import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {
    @Test
    void test1() {
        assertEquals(1, DrawingBook.pageCount(6, 2));
    }

    @Test
    void test2() {
        assertEquals(0, DrawingBook.pageCount(5, 4));
    }
}