package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class MajorityElementTest {

    @Test
    fun test() {
        val obj = MajorityElement()
        assertEquals(3, obj.majorityElement(intArrayOf(3, 2, 3)))
        assertEquals(2, obj.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
        assertEquals(3, obj.majorityElement(intArrayOf(3, 3, 4)))
    }
}