package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertFalse
import kotlin.test.Test
import kotlin.test.assertTrue

class ValidParenthesesTest {

    @Test
    fun test() {
        val obj = ValidParentheses()
        assertFalse(obj.isValid("["))
        assertFalse(obj.isValid("(("))
        assertFalse(obj.isValid("(({[[({["))
        assertFalse(obj.isValid(")]"))
        assertTrue(obj.isValid("()"))
        assertTrue(obj.isValid("()[]{}"))
        assertFalse(obj.isValid("(]"))
        assertTrue(obj.isValid("([])"))
        assertFalse(obj.isValid("([)]"))
    }
}