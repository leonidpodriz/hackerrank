import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndTheValidStringTest {

    @Test
    void test1() {
        assertEquals("YES", SherlockAndTheValidString.isValid("abc"));
    }

    @Test
    void test2() {
        assertEquals("YES", SherlockAndTheValidString.isValid("abcc"));
    }

    @Test
    void test3() {
        assertEquals("NO", SherlockAndTheValidString.isValid("abccc"));
    }

    @Test
    void test4() {
        assertEquals("NO", SherlockAndTheValidString.isValid("aabbcd"));
    }

    @Test
    void test5() {
        assertEquals("NO", SherlockAndTheValidString.isValid("aabbccddeefghi"));
    }


    @Test
    void test6() {
        assertEquals("YES", SherlockAndTheValidString.isValid("abcdefghhgfedecba"));
    }

    @Test
    void test7() {
        assertEquals("YES", SherlockAndTheValidString.isValid("aabbecc"));
    }

}