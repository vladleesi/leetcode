package dev.vladleesi

class SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()

        val result = mutableListOf<String>()
        var start = nums[0]

        for (i in 1..nums.size) {
            if (i == nums.size || nums[i] != nums[i - 1] + 1) {
                val end = nums[i - 1]
                if (start == end) {
                    result.add(start.toString())
                } else {
                    result.add("$start->$end")
                }
                if (i < nums.size) start = nums[i]
            }
        }

        return result
    }
}