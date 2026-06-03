class Solution {
    public int earliestFinishTime(int[] landS, int[] landD, int[] waterS, int[] waterD) {
        int ans = Integer.MAX_VALUE;
        int lmin = Integer.MAX_VALUE;
        for(int i = 0; i < landS.length; i++){
            lmin = Math.min(landS[i] + landD[i], lmin);
        }
        
        for(int j = 0; j < waterS.length; j++) {
            int k = 0;
            if(waterS[j] < lmin) {
                k = lmin + waterD[j];
            } else {
                k = waterS[j] + waterD[j];
            }
            ans = Math.min(k, ans);
        }
        
        int wmin = Integer.MAX_VALUE;
        for(int i = 0; i < waterS.length; i++){
            wmin = Math.min(waterS[i] + waterD[i], wmin);
        }
        
        for(int j = 0; j < landS.length; j++) {
            int k = 0;
            if(landS[j] < wmin) {
                k = wmin + landD[j];
            } else {
                k = landS[j] + landD[j];
            }
            ans = Math.min(k, ans);
        }
        
        return ans;
    }
}