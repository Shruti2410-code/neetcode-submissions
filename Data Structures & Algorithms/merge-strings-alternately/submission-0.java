class Solution {
    public String mergeAlternately(String w1, String w2) {
        int m = w1.length(), n = w2.length();
        String ans = "";
        int i = 0, j = 0;
        while(i < m && j < n) {
            ans += w1.charAt(i++);
            ans += w2.charAt(j++);
        }
        if(i == m) {
            while(j < n) ans += w2.charAt(j++);
        }
        if(j == n) {
            while(i < m) ans += w1.charAt(i++);
        }
        return ans;
    }
}