// Leetcode
// Ques: 2109. Adding Spaces to a String
// https://leetcode.com/problems/adding-spaces-to-a-string/description/?envType=daily-question&envId=2024-12-03


class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (j < spaces.length && i == spaces[j]) {
                ans.append(' ');
                ++j;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
