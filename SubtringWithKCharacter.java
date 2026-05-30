class Solution {
    public int longestSubstring(String s, int k) {
        int[] alpha =new int[26];
        if(s.length()<k){
            return 0;
        }
        for(char ch: s.toCharArray()){
            alpha[ch-'a']++;
        }
        for(int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if(alpha[ch-'a']<k){
                String left= s.substring(0,i);
                String right= s.substring(i+1);
                return Math.max(longestSubstring(left,k),longestSubstring(right,k));
            }
        }
        return s.length();
    }
}
class SubtringWithKCharacter{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k =sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.longestSubstring(s,k));
    }
}