class Solution {
    public void b(List<List<Integer>> res, List<Integer> l, int n[], boolean s[]){
        if(l.size() == n.length){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i = 0; i < n.length; i++){
            if(!s[i]){
                s[i] = true;
            l.add(n[i]);
            b(res, l, n, s);
            
            l.remove(l.size() - 1);
            s[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean s[] = new boolean[nums.length];
        b(res, new ArrayList<>(), nums, s);
        return res;
    }
}