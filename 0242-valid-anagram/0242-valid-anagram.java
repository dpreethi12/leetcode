class Solution {
    public boolean isAnagram(String s, String t) {
         int sn = s.length();
         int tn = t.length();
         if(sn != tn) return false;
        // HashMap<Character,Integer> p = new HashMap<>();
        // HashMap<Character,Integer> q = new HashMap<>();
        // for(int i = 0 ; i < sn ;i++){
        //     p.put(s.charAt(i), p.getOrDefault(s.charAt(i), 0) + 1);
        //     q.put(t.charAt(i), q.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // for(Character k : p.keySet()){
        //     if(!q.containsKey(k)) return false;
        //     else if(q.get(k) != p.get(k)) return false;
        // }
        // return true;
        int c[] = new int[26];
        for(int i = 0; i < sn; i++){
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }
        for(int count : c)
            if(count != 0) return false;

        return true;
    }
}