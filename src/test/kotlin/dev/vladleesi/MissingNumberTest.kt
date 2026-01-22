package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class MissingNumberTest {

    @Test
    fun test() {
        val obj = MissingNumber()
        assertEquals(2, obj.missingNumber(intArrayOf(3, 0, 1)))
        assertEquals(2, obj.missingNumber(intArrayOf(0, 1)))
        assertEquals(8, obj.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
    }
}