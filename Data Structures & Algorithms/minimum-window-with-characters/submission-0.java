class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), k = t.length();
        int[] freqT = new int[128];
        int[] freqW = new int[128];
        for (int i = 0; i < k; i++) freqT[t.charAt(i)]++;

        int i = 0, j = 0, have = 0, need = 0, resLen = Integer.MAX_VALUE, resStart = 0;

        for (int p = 0; p < 128; p++) {
            if (freqT[p] > 0)
                need++;
        }

        while (j < n) {
            char ch = s.charAt(j);
            freqW[ch]++;

            if (freqW[ch] == freqT[ch])
                have++;

            while (have == need) {
                if((j-i+1) < resLen) {
                    resLen = j-i+1;
                    resStart = i;
                }

                freqW[s.charAt(i)]--;

                if (freqT[s.charAt(i)] > 0 && freqW[s.charAt(i)] 
                < freqT[s.charAt(i)]) have--;

                i++;
            }
            j++;
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(resStart, resStart + resLen);
    }
}
