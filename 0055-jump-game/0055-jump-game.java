class Solution {

    int[] dp;

    boolean dfs(int[] nums, int idx) {

        if(idx >= nums.length - 1) return true;

        if(dp[idx] != 0) {
            return dp[idx] == 1;
        }

        for(int j = 1; j <= nums[idx]; j++) {

            if(dfs(nums, idx + j)) {
                dp[idx] = 1;
                return true;
            }
        }

        dp[idx] = -1;
        return false;
    }

    public boolean canJump(int[] nums) {
        dp = new int[nums.length];
        return dfs(nums, 0);
    }
}