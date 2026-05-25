class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j =0;
        int count=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
            else{
                j++;
                i++;
                count++;
            }
        }
        if(count==s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}
class Subsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String t =sc.next();
        Solution ob =new Solution();
        System.out.println(ob.isSubsequence(s,t));
    }
}