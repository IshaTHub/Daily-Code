26. Remove Duplicates from Sorted Array
/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int index = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[index-1]!= nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
