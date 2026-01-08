package dev.vladleesi.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class TwoSumTest {

    @Test
    fun test() {
        val obj = TwoSum()
        assertArrayEquals(
            intArrayOf(0, 1),
            obj.twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)
        )
        assertArrayEquals(
            intArrayOf(1, 2),
            obj.twoSum(nums = intArrayOf(3, 2, 4), target = 6)
        )
        assertArrayEquals(
            intArrayOf(0, 1),
            obj.twoSum(nums = intArrayOf(3, 3), target = 6)
        )
        assertArrayEquals(
            intArrayOf(1, 3),
            obj.twoSum(nums = intArrayOf(3, 7, 9, 1), target = 8)
        )
    }
}