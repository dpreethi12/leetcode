class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> p = new HashMap<>();
        HashMap<Character,Character> q = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!q.containsKey(t.charAt(i)) && !p.containsKey(s.charAt(i))){
                p.put(s.charAt(i),t.charAt(i));
                q.put(t.charAt(i),s.charAt(i));
            }else if(q.containsKey(t.charAt(i)) && q.get(t.charAt(i)) == s.charAt(i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}