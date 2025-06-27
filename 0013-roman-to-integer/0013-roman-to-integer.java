class Solution {
    public int value(char s){
        if(s == 'I')
            return 1;
        else if(s == 'V')
            return 5;
        else if(s == 'X')
            return 10;
        else if(s == 'L')
            return 50;
        else if(s == 'C')
            return 100;
        else if(s == 'D')
            return 500;
        else
            return 1000;
    }
    public int romanToInt(String s) {
        int sum = 0;
        //int t = value(s.charAt(0));
        boolean f = false;
        for(int i = 0; i < s.length(); i++){
            if(i + 1 < s.length() && value(s.charAt(i + 1)) > value(s.charAt(i))){
                sum += value(s.charAt(i + 1)) - value(s.charAt(i));
                i++;
                //t = value()
            }else{
                sum += value(s.charAt(i));    
            }
        }
        return sum;
    }
}