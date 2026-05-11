class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<String> l = new ArrayList<>();
        int n = 0;
        for(int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            l.addAll(Arrays.asList(str.split("")));
            n += str.length();
        }
        int arr[] = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(l.get(i));
        }
        return arr;
    }
}