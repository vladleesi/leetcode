package dev.vladleesi

class IntersectionTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = HashSet<Int>()
        for (num in nums1) {
            set.add(num)
        }
        val result = HashSet<Int>()
        for (num in nums2) {
            if (set.contains(num)) {
                result.add(num)
            }
        }
        return result.toIntArray()
    }
}