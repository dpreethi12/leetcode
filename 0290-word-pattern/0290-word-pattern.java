class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[] = s.split(" ");
        HashMap<Character,String> p = new HashMap<>();
        HashMap<String,Character> q = new HashMap<>();
        if(a.length != pattern.length()) return false;
        for(int i = 0; i < a.length; i++){
            char pc = pattern.charAt(i);
            if(!q.containsKey(a[i]) && !p.containsKey(pc)){
                p.put(pc,a[i]);
                q.put(a[i],pc);
            }else if(q.containsKey(a[i]) && q.get(a[i]) == pc){
                continue;
            }else
                return false;
        }
        return true;
    }
}