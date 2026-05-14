class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int count[] = new int[n];
        Arrays.fill(count, 0);
        for(int i = 0; i < n; i++) {
            if(nums[i] >= n) return false;
            count[nums[i]]++;
        }
        for(int i = 1; i < n - 1; i++){
            if(count[i] != 1) return false;
        }
        
        return count[n - 1] == 2;
    }

}