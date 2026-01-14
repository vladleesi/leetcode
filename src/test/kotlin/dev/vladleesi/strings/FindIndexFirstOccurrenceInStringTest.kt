package dev.vladleesi.strings

import kotlin.test.Test
import kotlin.test.assertEquals

class FindIndexFirstOccurrenceInStringTest {

    @Test
    fun test() {
        val obj = FindIndexFirstOccurrenceInString()
        assertEquals(0, obj.strStr(haystack = "sadbutsad", needle = "sad"))
        assertEquals(-1, obj.strStr(haystack = "leetcode", needle = "leeto"))
    }
}