26. Remove Duplicates from Sorted Array


var removeDuplicates = function(nums) {
    let numsLength = nums.length;
    for (let i = 0; i < numsLength; i++) {
        if (i >= nums.length) {
            break;
        }
        if (nums[i] === nums[i + 1]) {
            nums.splice(i, 1);
            i--;
        }
    }
};

The splice() method adds and/or removes array elements.

The splice() method overwrites the original array.
