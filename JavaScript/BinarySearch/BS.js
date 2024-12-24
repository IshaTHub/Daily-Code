function binarySearch(arr, target) {
    let start = 0;
    let end  = arr.length -1;
    while (start <= end) {
        let mid = Math.floor(start + (end - start)/2)
        if(arr[mid] == target){
            ans = mid;
            return ans;
        }
        else if(arr[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    return -1;
}

const arr = [0,1,2,3,4,6,100,10000];

console.log(binarySearch(arr, 100));

// In JavaScript, Math.floor() is a method that 
// rounds a number down to the nearest integer.
// It takes a single argument (a number) and returns the largest 
// integer less than or equal to that number.
