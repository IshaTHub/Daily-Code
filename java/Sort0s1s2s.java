// GFG
// Sort 0s, 1s and 2s
// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/sort-an-array-of-0s-1s-and-2s4231

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
       
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) 
                c0 += 1;
            else if (arr[i] == 1) 
                c1 += 1;
            else 
                c2 += 1;
        }

        int idx = 0;
      
        
        for (int i = 0; i < c0; i++)
            arr[idx++] = 0;

       
        for (int i = 0; i < c1; i++)
            arr[idx++] = 1;


        for (int i = 0; i < c2; i++)
            arr[idx++] = 2;
    }
    
}

//{ Driver Code Starts.
// } Driver Code Ends
