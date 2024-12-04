// GFG
// CamelCase pattern matching
// https://geeksforgeeks.org/batch/gfg-160-problems/track/string-bonus-problems/problem/camelcase-pattern-matching2259


//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String[] arr = sc.nextLine().split(" ");

            String pat = sc.nextLine();

            Solution ob = new Solution();
            List<String> ans = ob.camelCase(arr, pat);
            if (ans.isEmpty()) {
                System.out.println("[]");
            } else {
                // Sort results before printing
                Collections.sort(ans);
                System.out.println(String.join(" ", ans));
            }
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        // code here
        List<String> res = new ArrayList<>();
        
        for (String word : arr) {
            int i = 0, j = 0;
            
            // Iterate through the word
            while (i < word.length() && j < pat.length()) {
                char ch = word.charAt(i);
                
                // If the character is uppercase
                if (Character.isUpperCase(ch)) {
                    // Match with the pattern character
                    if (ch == pat.charAt(j)) {
                        j++; // Move to the next character in the pattern
                    } else {
                        break; // Pattern mismatch
                    }
                }
                i++; // Move to the next character in the word
            }
            
            // If we successfully matched the entire pattern
            if (j == pat.length()) {
                res.add(word);
            }
        }
        
        return res;
    }
}
