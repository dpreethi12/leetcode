class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int len = 0;
        boolean vis[] = new boolean[n];
        while(!q.isEmpty()) {
            int s = q.size();
            for(int k = 0; k < s; k++) {
                int idx = q.poll();
                if(idx == n - 1) return len ;

                for(int j = 1; j <= nums[idx]; j++) {
                    if(j + idx < n){
                        if(j + idx == n -1) return len + 1;
                        if(!vis[j + idx]){
                            vis[idx + j] = true;
                            q.add(j + idx);
                        }
                    }
                }
            }
            len++;
            
        }
        return len + 1;
    }
}