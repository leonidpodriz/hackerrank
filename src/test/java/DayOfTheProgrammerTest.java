import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheProgrammerTest {
    @Test
    void testFor2016_ByGeorgian() {
        assertEquals("12.09.2016", DayOfTheProgrammer.dayOfProgrammer(2016));
    }

    @Test
    void testFor1800_ByJulian() {
        assertEquals("12.09.1800", DayOfTheProgrammer.dayOfProgrammer(1800));
    }

    @Test
    void testFor2017_ByGeorgian() {
        assertEquals("13.09.2017", DayOfTheProgrammer.dayOfProgrammer(2017));
    }

    @Test
    void testFor1918_TransitionYear() {
        assertEquals("26.09.1918", DayOfTheProgrammer.dayOfProgrammer(1918));
    }
}