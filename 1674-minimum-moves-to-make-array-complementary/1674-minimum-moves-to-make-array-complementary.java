class Solution {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        int cost[] = new int[(2 * limit) + 1];
        Arrays.fill(cost, 0);
        for(int i = 0; i < n / 2; i++) {
            cost[2] += 2;
            int min = Math.min(nums[i], nums[n - i - 1]);
            int max = Math.max(nums[i], nums[n - i - 1]);
            cost[min + 1] -= 2;
            cost[min + 1] += 1;
            cost[min + max] -= 1;
            if(min + max < 2 * limit )
                cost[min + max + 1] += 1;
            if(max < limit){
                cost[max + limit + 1] -= 1;
                cost[max + limit + 1] += 2;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 2; i <= 2 * limit; i++) {
           cost[i] += cost[i - 1];
           ans = Math.min(ans, cost[i]);
        }
        return ans;
    }
}