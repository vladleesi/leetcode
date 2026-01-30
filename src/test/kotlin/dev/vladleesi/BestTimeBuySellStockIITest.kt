package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeBuySellStockIITest {

    @Test
    fun test() {
        val obj = BestTimeBuySellStockII()
        assertEquals(7, obj.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(4, obj.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, obj.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }
}