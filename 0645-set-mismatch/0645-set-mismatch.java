class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] cnt = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        for(int i = 1; i <= nums.length; i++) {
            if(cnt[i] == 2){
                res[0] = i;
            }else if(cnt[i] != 1) {
                res[1] = i; 
            }            
        }
        return res;
    }
}