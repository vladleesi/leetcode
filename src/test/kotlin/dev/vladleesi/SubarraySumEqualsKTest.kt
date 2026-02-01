package dev.vladleesi

import kotlin.test.Test
import kotlin.test.assertEquals

class SubarraySumEqualsKTest {

    @Test
    fun test() {
        val obj = SubarraySumEqualsK()
        assertEquals(2, obj.subarraySum(nums = intArrayOf(1, 1, 1), k = 2))
        assertEquals(2, obj.subarraySum(nums = intArrayOf(1, 2, 3), k = 3))
    }
}