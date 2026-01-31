package dev.vladleesi

class FindDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        val set = HashSet<Int>()
        for (num in nums) {
            if (!set.add(num)) return num
        }
        error("Duplicate guaranteed by problem constraints")
    }
}