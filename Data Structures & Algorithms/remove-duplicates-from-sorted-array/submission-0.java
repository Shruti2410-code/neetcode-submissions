class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, k = 0;
        while(j < n) {
            if(nums[i] == nums[j]) j++;
            else if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++; j++;
                k++;
            }
        }
        return k+1;
    }
}