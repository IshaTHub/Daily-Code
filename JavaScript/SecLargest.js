# https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
//{ Driver Code Starts
// Initial Template for javascript

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => { inputString += inputStdin; });

process.stdin.on('end', _ => {
    inputString = inputString.trim().split("\n").map(string => string.trim());
    main();
});

function readLine() { return inputString[currentLine++]; }

function main() {
    let t = parseInt(readLine());
    for (let i = 0; i < t; i++) {
        const arr = readLine().split(' ').map(x => parseInt(x));
        let obj = new Solution();
        let ans = obj.getSecondLargest(arr);
        console.log(ans);
        console.log("~");
    }
}

// } Driver Code Ends

// } Driver Code Ends


// User function Template for javascript

class Solution {
    // Function returns the second largest element
    getSecondLargest(arr) {
        // Code Here
        if(arr.length < 2){
            return -1;
        }
        let Large = arr[0];
        let secLarge = -1;
        
        for(let i = 0; i< arr.length; i++){
            if(arr[i]>Large){
                secLarge = Large;
                Large = arr[i];
            }
            else if( arr[i] < Large && arr[i] > secLarge){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }
}
