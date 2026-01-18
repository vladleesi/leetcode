package dev.vladleesi

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test
import kotlin.test.assertEquals

class MergeSortedArrayTest {

    @Test
    fun test() {
        val obj = MergeSortedArray()

        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        obj.merge(nums1 = nums1, m = 3, nums2 = intArrayOf(2, 5, 6), n = 3)
        assertArrayEquals(
            intArrayOf(1, 2, 2, 3, 5, 6),
            nums1,
        )

        val nums2 = intArrayOf(1)
        obj.merge(nums1 = nums2, m = 1, nums2 = intArrayOf(), n = 0)
        assertArrayEquals(
            intArrayOf(1),
            nums2
        )

        val nums3 = intArrayOf(0)
        obj.merge(nums1 = nums3, m = 0, nums2 = intArrayOf(1), n = 1)
        assertArrayEquals(
            intArrayOf(1),
            nums3
        )
    }
}