class Solution {
    public int characterReplacement(String str, int k) {
        int n = str.length();
        int[] freq = new int[26];
        int l = 0, r = 0, ans = 0, maxFreq = 0;
        while (r < n) {
            char ch = str.charAt(r);
             freq[ch-'A']++;
             maxFreq = Math.max(maxFreq, freq[ch-'A']);
           
            if ((r-l+1) - maxFreq > k) {
                freq[str.charAt(l)-'A']--;
                l++;
            }
           
           
            ans = Math.max(ans, (r - l + 1));
            r++;
        }
        return ans;
    }
}
