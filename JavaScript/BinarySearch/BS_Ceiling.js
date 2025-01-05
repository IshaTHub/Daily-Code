function binarySearchCeil(arr, target) {
    let ans = -1;
    let start = 0;
    let end = arr.length - 1;

    while (start <= end) {
        const mid = Math.floor(start + (end - start) / 2);
        if (arr[mid] === target) {
            ans = arr[mid];
            break;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            ans = arr[mid];
            end = mid - 1;
        }
    }
    return ans;
}
