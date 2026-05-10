class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        int k = 0;
        for(int i = 1; i <= target[target.length - 1]; i++) {
            if(i == target[k]) {
                l.add("Push");
                k++;
            }else {
                l.add("Push");
                l.add("Pop");
            }
        }
        return l;
    }
}