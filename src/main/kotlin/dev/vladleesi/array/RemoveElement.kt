package dev.vladleesi.array

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        for (num in nums) {
            if (num != `val`) {
                // Replace item with the right one and compact array in-place
                // `val` = 3, [3, 2, 2, 3] -> [2, 2, 2, 3]
                nums[index++] = num
            }
        }
        return index
    }
}