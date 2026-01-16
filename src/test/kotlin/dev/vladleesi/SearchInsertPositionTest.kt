package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class SearchInsertPositionTest {

    @Test
    fun test() {
        val obj = SearchInsertPosition()
        assertEquals(2, obj.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, obj.searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(4, obj.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }
}