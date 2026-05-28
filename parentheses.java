class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(')');
            }
            else if(ch=='['){
                st.push(']');
            }
            else if(ch=='{'){
                st.push('}');
            }
            else{
                if(st.isEmpty() || ch != st.peek()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
class Parentheses{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        Solution ob = new Solution();
        System.out.println(ob.isValid(s));
    }
}