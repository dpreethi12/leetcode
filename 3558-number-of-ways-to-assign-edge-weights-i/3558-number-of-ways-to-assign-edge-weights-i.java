class Solution {
    int mod = 1_000_000_007;
    public int assignEdgeWeights(int[][] edges) {
        HashMap<Integer, List<Integer>> h = new HashMap<>();

        for(int e[] : edges) {
            h.putIfAbsent(e[0], new ArrayList<>());
            h.putIfAbsent(e[1], new ArrayList<>());
            h.get(e[0]).add(e[1]);
            h.get(e[1]).add(e[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        Set<Integer> vis = new HashSet<>();
        vis.add(1);
        int depth = -1;
        while(!q.isEmpty()) {
            depth++;
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int curr = q.remove();
                List<Integer> l = h.get(curr);
                if(l == null) continue;
                for(int k : l) {
                    if(vis.contains(k)) continue;
                    q.add(k);
                    vis.add(k);
                }
            }
        }
        return pow(2, depth - 1);
    }

    int pow(int base, int exp) {
        long res = 1;
        long b = base % mod;
        
        while(exp > 0) {
            if((exp & 1) == 1) {
                res = res * b % mod;
            }
            b = b * b % mod;
            exp = exp >> 1;
        }

        return (int)res;
    }
}