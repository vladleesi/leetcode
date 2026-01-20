package dev.vladleesi

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>(nums.size)
        for (n in nums) {
            if (!set.add(n)) {
                return true
            }
        }
        return false
    }
}