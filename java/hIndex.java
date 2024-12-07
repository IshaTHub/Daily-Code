// GFG
// Ques: Find H-Index
// Medium
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/find-h-index--165609

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine().trim());

        while (test_cases-- > 0) {
            // Read the array from input line
            String[] input = br.readLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            // Solution instance to invoke the function
            Solution ob = new Solution();
            int result = ob.hIndex(arr);

            System.out.println(result);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int[] bucket = new int[citations.length+1];
        for(int i = 0; i<citations.length; i++){
            if(citations[i]>citations.length){
                bucket[citations.length]++;
            }
            else{
                bucket[citations[i]]++;
            }
            
        }
        int count = 0;
        for(int i = bucket.length-1; i>=0; i--){
            count += bucket[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}
