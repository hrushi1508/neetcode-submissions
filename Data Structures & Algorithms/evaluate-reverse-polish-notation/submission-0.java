class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            try{
                int num = Integer.parseInt(tokens[i]);
                stk.push(num);
            }catch(Exception e){
                int num1 = stk.pop();
                int num2 = stk.pop();
                switch(tokens[i]){
                    case "+":
                        stk.push(num2+num1);
                        break;
                    case "-":
                        stk.push(num2-num1);
                        break;
                    case "*":
                        stk.push(num2*num1);
                        break;
                    case "/":
                        stk.push(num2/num1);
                        break;
                    default:
                        continue;
                }
            }
        }
        return stk.pop();
    }
}
