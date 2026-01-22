package dev.vladleesi

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var diff = 0
        for (i in 0 until nums.size + 1) {
            diff += i
        }
        for (n in nums) {
            diff -= n
        }
        return diff
    }
}