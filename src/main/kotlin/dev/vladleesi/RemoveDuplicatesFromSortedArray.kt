package dev.vladleesi

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var result = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                // Move next unique value to the write position
                nums[result] = nums[i]
                result++
            }
        }
        return result
    }
}