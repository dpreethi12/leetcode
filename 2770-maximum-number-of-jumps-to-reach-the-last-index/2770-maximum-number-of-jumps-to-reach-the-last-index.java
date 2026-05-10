class Solution {
    Integer dp[];
    public int helper(int idx, int[] nums, int target) {
        if(idx == nums.length - 1) return 0;
        int max = -1;

        if(dp[idx] != null) return dp[idx];

        for(int i = idx + 1; i < nums.length; i++) {
           
            if(Math.abs(nums[i] - nums[idx]) <= target) {
                int next = helper(i, nums, target);
                if(next != -1) {
                    max = Math.max(max, next + 1);
                }
            }
        }
        return dp[idx] = max;
    }
    public int maximumJumps(int[] nums, int target) {
        dp = new Integer[nums.length];
        return helper(0, nums, target);
    }

}