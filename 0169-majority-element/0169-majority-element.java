class Solution {
    public int majorityElement(int[] nums) {
        int e1 = -1;
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(e1 == nums[i]){
                c++;
            }else if(c == 0){
                e1 = nums[i];
                c++;
            }else{
                c--;
            }
        }
        return e1;
    }
}