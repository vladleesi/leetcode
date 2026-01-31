package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class FindDuplicateNumberTest {

    @Test
    fun test() {
        val obj = FindDuplicateNumber()
        assertEquals(2, obj.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
        assertEquals(3, obj.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
        assertEquals(3, obj.findDuplicate(intArrayOf(3, 3, 3, 3, 3)))
    }
}