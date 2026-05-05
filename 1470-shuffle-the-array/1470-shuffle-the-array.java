class Solution {
    public int[] shuffle(int[] nums, int n) {
        int max = 1001;
        for (int i = 0; i < n; i++) {
            nums[i + n] = nums[i + n] * max + nums[i];
        }

        int index = 0;

        for (int i = n; i < 2 * n; i++) {
            int y = nums[i] / max;
            int x = nums[i] % max;

            nums[index++] = x;
            nums[index++] = y;
        }

        return nums;
    }
}