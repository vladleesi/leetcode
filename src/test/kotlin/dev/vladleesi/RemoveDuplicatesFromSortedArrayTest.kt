package dev.vladleesi

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun test() {
        val obj = RemoveDuplicatesFromSortedArray()
        assertEquals(2, obj.removeDuplicates(intArrayOf(1, 1, 2)))
        assertEquals(5, obj.removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
    }
}