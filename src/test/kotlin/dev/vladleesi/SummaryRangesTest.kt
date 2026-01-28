package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class SummaryRangesTest {

    @Test
    fun test() {
        val obj = SummaryRanges()
        assertEquals(listOf("0->2", "4->5", "7"), obj.summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
        assertEquals(listOf("0", "2->4", "6", "8->9"), obj.summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)))
    }
}