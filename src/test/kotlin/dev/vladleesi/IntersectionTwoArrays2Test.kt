package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class IntersectionTwoArrays2Test {

    @Test
    fun test() {
        val obj = IntersectionTwoArrays2()
        assertArrayEquals(intArrayOf(2, 2), obj.intersect(nums1 = intArrayOf(1, 2, 2, 1), nums2 = intArrayOf(2, 2)))
        assertArrayEquals(
            intArrayOf(9, 4),
            obj.intersect(nums1 = intArrayOf(4, 9, 5), nums2 = intArrayOf(9, 4, 9, 8, 4))
        )
        assertArrayEquals(
            intArrayOf(9, 4, 9),
            obj.intersect(nums1 = intArrayOf(4, 9, 5, 9), nums2 = intArrayOf(9, 4, 9, 8, 4))
        )
        assertArrayEquals(
            intArrayOf(1),
            obj.intersect(nums1 = intArrayOf(3, 1, 2), nums2 = intArrayOf(1, 1))
        )
    }
}