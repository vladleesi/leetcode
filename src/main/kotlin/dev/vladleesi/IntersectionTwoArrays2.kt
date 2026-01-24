package dev.vladleesi

class IntersectionTwoArrays2 {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val (small, large) = if (nums1.size <= nums2.size) nums1 to nums2 else nums2 to nums1

        // Count occurrences of each number in the smaller array
        val freq = HashMap<Int, Int>()
        for (num in small) {
            freq[num] = (freq[num] ?: 0) + 1
        }

        // Build intersection by consuming counts from the map
        val result = ArrayList<Int>()
        for (num in large) {
            val count = freq[num] ?: 0
            if (count > 0) {
                result.add(num)
                if (count == 1) freq.remove(num) else freq[num] = count - 1
            }
        }

        return result.toIntArray()
    }
}