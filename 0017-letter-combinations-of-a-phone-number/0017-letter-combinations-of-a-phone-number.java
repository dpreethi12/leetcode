class Solution {
    public void b(String s, String f,List<String> l,HashMap<Character,String> h,int i){
        if(s.length() == f.length()){
            l.add(f);
            return;
        }
            for(char k : h.get(s.charAt(i)).toCharArray()){
                b(s,f + k,l,h,i+1);
            
        }
        return;
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> h = new HashMap<>();
        h.put('2',"abc");
        h.put('3',"def");
        h.put('4',"ghi");
        h.put('5',"jkl");
        h.put('6',"mno");
        h.put('7',"pqrs");
        h.put('8',"tuv");
        h.put('9',"wxyz");
        List<String> l = new ArrayList<>();
        if(digits.length() == 0)return l;
        b(digits,"",l,h,0);
        return l;
    }
}