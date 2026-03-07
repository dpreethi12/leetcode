class Solution {
    public boolean checkOnesSegment(String s) {
       
        int i = 0;
        while(i < s.length() && s.charAt(i) != '0') {
            i ++;
        }
        for(int j = i + 1; j < s.length(); j++) {
            if(s.charAt(j) == '1') return false;
        }
        return true;
    }
}