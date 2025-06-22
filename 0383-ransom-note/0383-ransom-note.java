class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            h1.put(c, h1.getOrDefault(c,0) + 1); 
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c) -1);
                if(h1.get(c) < 0) return false;
            }else
                return false;
        }
        return true;
    }
}