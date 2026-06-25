class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int i = 0, j = n-1;
        int res = Integer.MIN_VALUE;
        while(i < j) {
            int width = j-i;
            int ht = Math.min(arr[i], arr[j]);
            res = Math.max(res, (width*ht));

            if(arr[i] < arr[j]) i++;
            else j--;
        }
        return res;
    }
}
