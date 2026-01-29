package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class TwoSumIITest {

    @Test
    fun test() {
        val obj = TwoSumII()
        assertArrayEquals(intArrayOf(1, 2), obj.twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertArrayEquals(intArrayOf(1, 3), obj.twoSum(intArrayOf(2, 3, 4), 6))
        assertArrayEquals(intArrayOf(1, 2), obj.twoSum(intArrayOf(-1, 0), -1))
        assertArrayEquals(intArrayOf(7, 8), obj.twoSum(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 15))
    }
}