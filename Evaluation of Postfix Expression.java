class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for(char c: S.toCharArray()) {
            if(c >= '0' && c<= '9') {
                st.push(Character.getNumericValue(c));
            }
            else if(c == '+') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2+num1);
            }
            else if(c == '-') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2-num1);
            }
            else if(c == '*') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2*num1);
            }
            else if(c == '/') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2/num1);
            }
        }
        return st.peek();
    }
}