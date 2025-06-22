class Solution {
    public void b(List<Integer> l, int j,List<List<Integer>> f,int k,int n){
        if(l.size() == k){
            f.add(new ArrayList<>(l));
            return;
        }
        for(int i = j; i <= n; i++){
            l.add(i);
            b(l,i+1,f,k,n);
            l.remove(l.size() - 1);
        }
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        b(new ArrayList<>(),1,l,k,n);
        return l;
    }
}