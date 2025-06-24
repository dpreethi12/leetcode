class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int lastRead = nums[0];
        //int cnt[] = new int[n];
        int k = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != lastRead){
                nums[k] = nums[i];
                k++;
                lastRead = nums[i];
            }
        }
        return k;
    }
}