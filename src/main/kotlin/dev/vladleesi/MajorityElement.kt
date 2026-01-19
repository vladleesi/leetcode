package dev.vladleesi

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var candidate = 0
        var count = 0

        for (n in nums) {
            // If balance is zero, pick a new candidate
            if (count == 0) {
                candidate = n
            }
            // Vote for or against the candidate
            count += if (n == candidate) 1 else -1
        }
        return candidate
    }
}