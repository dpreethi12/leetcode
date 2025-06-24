class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int a[] = new int[n];
        Arrays.fill(a, -1);
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}