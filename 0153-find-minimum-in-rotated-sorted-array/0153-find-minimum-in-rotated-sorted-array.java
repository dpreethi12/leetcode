class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        if(nums[0] < nums[n - 1] || n == 1) return nums[0];
        //if(nums[0] > nums[1]) return nums[1];
        
        int left = 0, right = n - 1, mid = 0;
      
        while(left < right) {
            mid = (left + right) / 2;
            if(nums[0] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid ;
            }
        }
        return nums[right];
    }
}