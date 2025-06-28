class Solution {
    public int removeDuplicates(int[] a) {
        int k = 1;
        int v = a[0];
        boolean f = true;
        for(int i = 1; i < a.length; i++){
            if(f && a[i] == a[i-1]){
                a[k] = a[i];
                k++;
                f = false;
            }
            else if(a[i] != v){
                a[k] = a[i];
                k++;
                v = a[i];
                f = true;
            }
        }
        return k;
    }
}