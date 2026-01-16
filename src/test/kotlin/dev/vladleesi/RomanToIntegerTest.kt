package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class RomanToIntegerTest {

    @Test
    fun test() {
        val obj = RomanToInteger()
        assertEquals(1, obj.romanToInt("I"))
        assertEquals(5, obj.romanToInt("V"))
        assertEquals(10, obj.romanToInt("X"))
        assertEquals(50, obj.romanToInt("L"))
        assertEquals(100, obj.romanToInt("C"))
        assertEquals(500, obj.romanToInt("D"))
        assertEquals(1000, obj.romanToInt("M"))
        // Complex
        assertEquals(3, obj.romanToInt("III"))
        assertEquals(58, obj.romanToInt("LVIII"))
        assertEquals(1994, obj.romanToInt("MCMXCIV"))
    }
}