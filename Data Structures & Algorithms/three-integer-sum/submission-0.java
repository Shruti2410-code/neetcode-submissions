class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int k = 0; k < n; k++) {
            if(k > 0 && nums[k] == nums[k-1]) continue;
            int i = k + 1, j = n - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    i++;
                } else if (sum == 0) {
                    ans.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++; j--;
                    while(i < j && nums[i] == nums[i-1]) i++; 
                    while(i < j && nums[j] == nums[j+1]) j--;
                    
                } else {
                    j--;
                }
            }
        }
        return ans;
    }
}
