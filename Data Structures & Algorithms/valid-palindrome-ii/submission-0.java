class Solution {
    private boolean helper(String s, int i, int j) {
        int l = i, r = j;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return helper(s,i+1,j) || helper(s,i,j-1);
            }
            i++; j--;
        }
        return true;
    }
}