class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char res[][] = new char[n][m];
        boolean seen = false;
        int flag = 0;

        for(int i = 0; i < m; i++) {
            flag = -1;
            seen = false;
            for(int j = 0; j < n; j++) {
                if(boxGrid[i][j] == '#' && (!seen)){
                    flag = j;
                    seen = true;
                } else if(boxGrid[i][j] == '*') {
                    flag = -1;
                    seen = false;
                } else if(boxGrid[i][j] == '.' && flag != -1) {
                    boxGrid[i][j] = '#';
                    boxGrid[i][flag] = '.';
                    if(flag + 1 < n){
                        flag = flag + 1;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res[i][j] = boxGrid[m-j-1][i];
            }
        }
        return res;
    }
}