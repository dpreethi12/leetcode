class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int idx = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, idx - 1);
        reverse(nums, idx, n - 1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}