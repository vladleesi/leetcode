package dev.vladleesi

class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val freq = hashMapOf<Int, Int>()

        // sum 0 exists before we start
        freq[0] = 1

        var sum = 0
        var result = 0

        for (num in nums) {
            // add current number to total
            sum += num
            // how many times we saw (sum - k) before
            result += freq.getOrDefault(sum - k, 0)
            // remember this sum
            freq[sum] = freq.getOrDefault(sum, 0) + 1
        }

        return result
    }
}