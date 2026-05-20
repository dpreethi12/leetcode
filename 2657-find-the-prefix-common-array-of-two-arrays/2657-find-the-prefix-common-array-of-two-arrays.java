class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        int p[] = new int[A.length];
        Arrays.fill(p, 0);
        for(int i = 0; i < A.length; i++) {
            h1.add(A[i]);
            h2.add(B[i]);
            if(A[i] == B[i]) {
                p[i] = i > 0 ? p[i - 1] + 1 : 1; 
            } else {
                if(h2.contains(A[i]) && h1.contains(B[i]))
                    p[i] = i > 0 ? p[i - 1] + 2 : 1;
                else if(h1.contains(B[i]) || h2.contains(A[i]))
                    p[i] = i > 0 ? p[i - 1] + 1 : 1;   
                else
                    p[i] = i > 0 ? p[i - 1] : 0;   
                    
            }
        }
        return p;
    }
}