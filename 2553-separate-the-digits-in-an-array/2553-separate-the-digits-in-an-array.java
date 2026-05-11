class Solution {
    public int countDigits(int n ) {
        int cnt = 0;
        while(n > 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }
    public int[] separateDigits(int[] nums) {
        int total  = 0;
        for(int num : nums) {
            total += countDigits(num);
        }

        int arr[] = new int[total];
        int idx = 0;

        for(int i = 0; i < nums.length; i++) {
            int len = countDigits(nums[i]);
            int div = (int)Math.pow(10, len - 1);
            while(div > 0) {
                arr[idx++] = nums[i] / div;
                nums[i] = nums[i] % div;
                div = div / 10;
            }
        }
        return arr;
    }
}