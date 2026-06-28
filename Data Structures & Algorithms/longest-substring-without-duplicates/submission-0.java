class Solution {
    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        Set<Character> s = new HashSet<>();
        int l = 0, r = 0, ans = 0;
        while (r < n) {

            char ch = str.charAt(r);
            while (s.contains(ch)) {
                s.remove(str.charAt(l));
                l++;
            }
            s.add(ch);
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
