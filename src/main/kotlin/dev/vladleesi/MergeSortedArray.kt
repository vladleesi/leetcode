package dev.vladleesi

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1

        // Continue until all elements from nums2 are merged
        while (j >= 0) {
            // Place the larger of nums1[i] and nums2[j] at position k
            nums1[k--] = if (i >= 0 && nums1[i] > nums2[j]) nums1[i--] else nums2[j--]
        }
    }
}