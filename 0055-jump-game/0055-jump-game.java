class Solution {
    boolean dp[];
    boolean dfs(int nums[], int n, int idx) {
        if(idx == n - 1) return true;
        if(!dp[idx]) return false;
        for(int j = 1; j <= nums[idx]; j++){    
            if(idx + j < n)
                if(dfs(nums, n, idx + j)){
                    return true;
                }else {
                    dp[idx + j] = false;
                }
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        dp = new boolean[nums.length];
        Arrays.fill(dp, true);
        return dfs(nums, nums.length, 0);
    }
}