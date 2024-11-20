function rotate(nums, k) {
    const n = nums.length;
    const temp = new Array(n);

    for (let i = 0; i < n; i++) {
        temp[(i + k) % n] = nums[i];
    }

    // Copy elements back to the original array
    for (let i = 0; i < n; i++) {
        nums[i] = temp[i];
    }
}
