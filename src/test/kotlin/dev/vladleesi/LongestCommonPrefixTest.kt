package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {

    @Test
    fun test() {
        val obj = LongestCommonPrefix()
        assertEquals("fl", obj.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", obj.longestCommonPrefix(arrayOf("dog","racecar","car")))
        assertEquals("a", obj.longestCommonPrefix(arrayOf("a", "a", "ab")))
    }
}