package dev.vladleesi

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] >= target) {
                return i
            }
        }
        return nums.size
    }
}