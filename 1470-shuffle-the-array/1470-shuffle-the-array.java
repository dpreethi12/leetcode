class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp[] = new int[2 * n];
        int j = 0;
        for (int i = 0; i < (2 * n); i++) {
            if(i % 2 == 0) {
                temp[i] = nums[j];
            }else {
                temp[i] = nums[j + n];
                j++;
            }
        }
        return temp;
    }
}