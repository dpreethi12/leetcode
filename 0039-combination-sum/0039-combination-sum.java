class Solution {
    public void b(List<List<Integer>> res, List<Integer> l, int t, int num[],int i){
        //if(s>t) return;
        if(0 == t){
            res.add(new ArrayList<>(l));
            return;
        }
        if(t < 0 || i == num.length) return;
        
            l.add(num[i]);
            b(res,l,t-num[i],num,i);
            l.remove(l.size() - 1);
            b(res,l,t,num,i+1);
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        b(res, new ArrayList<>(), target,candidates, 0);
        return res;
    }
}