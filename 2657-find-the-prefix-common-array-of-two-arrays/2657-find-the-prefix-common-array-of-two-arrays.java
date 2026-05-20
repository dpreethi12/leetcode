class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> h = new HashSet<>();
        int p[] = new int[A.length];
        Arrays.fill(p, 0);
        for(int i = 0; i < A.length; i++) {
            if(A[i] == B[i]) {
                p[i] = i > 0 ? p[i - 1] + 1 : 1; 
            } else {
                if(h.contains(A[i]) && h.contains(B[i]))
                    p[i] = i > 0 ? p[i - 1] + 2 : 1;
                else if(h.contains(B[i]) || h.contains(A[i]))
                    p[i] = i > 0 ? p[i - 1] + 1 : 1;   
                else
                    p[i] = i > 0 ? p[i - 1] : 0;           
            }
            h.add(A[i]);
            h.add(B[i]);
        }
        return p;
    }
}