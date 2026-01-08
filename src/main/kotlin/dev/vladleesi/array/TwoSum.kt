package dev.vladleesi.array

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            val result = target - nums[i]
            if (map.containsKey(result)) {
                return intArrayOf(map[result]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}