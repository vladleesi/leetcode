package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class ValidPalindromeTest {

    @Test
    fun test() {
        val obj = ValidPalindrome()
        assertTrue(obj.isPalindrome(s = "A man, a plan, a canal: Panama"))
        assertFalse(obj.isPalindrome(s = "race a car"))
        assertTrue(obj.isPalindrome(s = " "))
    }
}