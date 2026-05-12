class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1) return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(String s : tokens) {
            if(!s.equals("+") && !s.equals("*") && !s.equals("/") && !s.equals("-")) {
                stack.push(Integer.parseInt(s)); 
            } else {
                int b = stack.pop();
                int a = stack.pop();

                if(s.equals("+")){
                    stack.push(a + b);
                }else if(s.equals("*")) {
                    stack.push(a * b);
                } else if(s.equals("-")) {
                    stack.push(a - b);
                } else {
                    stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }
}