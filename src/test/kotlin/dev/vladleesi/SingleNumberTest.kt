package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class SingleNumberTest {

    @Test
    fun test() {
        val obj = SingleNumber()
        assertEquals(1, obj.singleNumber(intArrayOf(2, 2, 1)))
        assertEquals(4, obj.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
        assertEquals(1, obj.singleNumber(intArrayOf(1)))
    }
}