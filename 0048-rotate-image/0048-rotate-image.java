class Solution {
    public void reverse(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int r1 = 0, r2 = m - 1, c1 = n - 1, c2 = 0;
        while(r1 < r2 && c2 < c1) {
            int total =  2 * ((r2 - r1) + (c1 - c2));
        int k = c1 - c2 + 1;
            int arr[] = new int[total];
            int p = 0;
            int r = k % (total);
            for(int i = c2; i < c1; i++) {
                arr[p] = grid[r1][i];
                p++;
            }
            for(int i = r1; i < r2; i++) {
                arr[p] = grid[i][c1];
                p++;
            }
            for(int i = c1; i > c2; i--) {
                arr[p] = grid[r2][i];
                p++;
            }
            for(int i = r2; i > r1; i--) {
                arr[p] = grid[i][c2];
                p++;
            }

            reverse(arr, 0, total-k);
            reverse(arr, total-k+1,total-1);
            reverse(arr, 0, total-1);
            p = 0;

            for(int i = c2; i < c1; i++) {
                grid[r1][i] = arr[p];
                p++;
            }
            for(int i = r1; i < r2; i++) {
                grid[i][c1] = arr[p];
                p++;
            }
            for(int i = c1; i > c2; i--) {
                grid[r2][i] = arr[p];
                p++;
            }
            for(int i = r2; i > r1; i--) {
                grid[i][c2] = arr[p];
                p++;
            }

            r1++;
            r2--;
            c1--;
            c2++;
        }
    }
}