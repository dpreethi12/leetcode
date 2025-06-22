class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //int i = 0;
        HashSet<String> h = new HashSet<>(wordDict);
        int n = s.length();
        boolean dp[] = new boolean[n + 1];
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i; j++){
                if(dp[j] && h.contains(s.substring(j,i))) dp[i] = true;
            }
        }
        return dp[n];
    }
}