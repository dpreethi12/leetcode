class Solution {
    public void rotate(int[] nums, int n) {
        int k = n % nums.length;
        int a[] = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = nums[i + nums.length - k];
        }
        //int t = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= k ; i--){
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < k;i++){
            nums[i] = a[i];
        }
        //nums[0] = t;
        
        
    }
}