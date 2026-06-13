class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            int w = 0;
            for(int i = 0; i < word.length(); i++) {
                w += weights[word.charAt(i) - 97];
            }
            w = w % 26;
            sb.append((char)(122 - w));
        }
        return sb.toString();
    }
}