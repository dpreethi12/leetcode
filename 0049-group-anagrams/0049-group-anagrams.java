class Solution {
    public String freq(String s){
        int f[] = new int[26];
        for(char c : s.toCharArray()){
            f[c - 'a']++;
        }
        StringBuilder p = new StringBuilder("");
        char c = 'a';
        for(int i = 0; i< 26; i++){
            p.append(c + i);
            p.append(f[i]);
        }
        return p.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        if(strs == null || strs.length == 0) return new ArrayList<>();
        for(String st : strs){
            String fs = freq(st);
            if(h.containsKey(fs)){
                h.get(fs).add(st);
            }else{
                List<String> l = new ArrayList<>();
                l.add(st);
                h.put(fs,l);;
            }
        }
        return new ArrayList<>(h.values());
    }
}