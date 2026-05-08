class Solution {
    public boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int minJumps(int[] nums) {
        int max = -1;
        int n = nums.length;
        if(n == 1) return 0;
        Map<Integer, List<Integer>> h = new HashMap<>();
        int dist[] = new int[n];
        for(int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
            dist[i] = -1;
            h.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        HashSet<Integer> vis = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();

        dist[0] = 0;
        q.add(0);

        while(!q.isEmpty()) {
            int curr = q.remove();
            vis.add(curr);

            List<Integer> nextJumps = new ArrayList<>();
            int k = nums[curr];
            if(curr - 1 >= 0) {
                nextJumps.add(curr - 1);
            }
            if(curr + 1 < n) {
                nextJumps.add(curr + 1);
            }
            if(isPrime(k)) {
                for(int mul = k; mul <= max; mul += k) {
                    if(h.containsKey(mul)) {
                        nextJumps.addAll(h.get(mul));
                        h.remove(mul);
                    }
                }
            }

            for(int next : nextJumps) {
                if(dist[next] == -1) {
                    dist[next] = dist[curr] + 1;
                    if(next == n -1)
                        return dist[next];
                    if(!vis.contains(next))
                        q.add(next);
                }
            }

        } 
        return dist[n - 1];
  
    }
}