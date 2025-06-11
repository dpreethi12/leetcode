class Solution {
    public boolean dfs(List<List<Integer>> a, int source, int destination, boolean vis[]){
        if(source == destination)
            return true;
        if(vis[source])
            return false;
        vis[source] = true;
        for(int v : a.get(source)){
            if(dfs(a, v, destination, vis))
                return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean vis[] = new boolean[n];
        List<List<Integer>> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            a.get(edge[0]).add(edge[1]);
            a.get(edge[1]).add(edge[0]);
        }
        return dfs(a, source, destination, vis);
    }
}