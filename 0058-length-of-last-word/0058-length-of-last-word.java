class Solution {
    public int lengthOfLastWord(String st) {
        String s[] = st.split(" ");
        return s[s.length - 1].length();
    }
}