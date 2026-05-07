class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int maxPrefix[] = new int[n];
        int minSuffix[] = new int[n];
        maxPrefix[0] = nums[0];
        for(int i = 1; i < n; i++) {
            maxPrefix[i] = Math.max(maxPrefix[i - 1], nums[i]);
        }
        minSuffix[n - 1] = nums[n - 1];
        for(int i = n-2; i >= 0; i--) {
            minSuffix[i] = Math.min(minSuffix[i + 1], nums[i]);
        }
        res[n - 1] = maxPrefix[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            if(maxPrefix[i] > minSuffix[i + 1])
                res[i] = res[i + 1];
            else
                res[i] = maxPrefix[i];
        } 
        return res;
    }
}