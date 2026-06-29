class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int n = s2.length();
        int[] freq1 = new int[26];
        for(int i = 0; i < k; i++) freq1[s1.charAt(i)-'a']++;
        int[] freq2 = new int[26];
        int i = 0, j = 0;
        while(j < n) {
            char ch = s2.charAt(j);
            freq2[ch-'a']++;

            if((j-i+1) < k) j++;
            else if((j-i+1) == k) {
                if(Arrays.equals(freq1,freq2)) return true;
                freq2[s2.charAt(i)-'a']--;
                i++;
                j++;
            }
        }
        return false;
    }
}
