class Solution {
    public int dp(int i,int[] d){
        if(i == 0 || i == 1) return 1;
        if(d[i] != -1) return d[i];
        d[i] = dp(i - 1,d) + dp(i - 2,d);
        return d[i];
    }
    public int climbStairs(int n) {
        int[] d = new int[n+1];
        Arrays.fill(d,-1);
        return dp(n,d);
    }
}