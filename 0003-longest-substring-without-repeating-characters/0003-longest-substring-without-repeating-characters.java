class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Set<Character> a = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            while(a.contains(s.charAt(i))){
                a.remove(s.charAt(left));
                left++;
            }
            a.add(s.charAt(i));
            max = Math.max(max, i-left+1);
        }
        return max;
    }
}