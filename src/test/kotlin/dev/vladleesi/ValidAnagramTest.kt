package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidAnagramTest {

    @Test
    fun test() {
        val obj = ValidAnagram()
        assertTrue { obj.isAnagram(s = "anagram", t = "nagaram") }
        assertFalse { obj.isAnagram(s = "rat", t = "car") }
    }
}