class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alpha= new int[26];
        for(int i=0; i<s.length() ;i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for(int a:alpha){
            if(a!=0){
                return false;
            }
        }
        return true;
    }
}

class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();//takes only one word
        String t= sc.next();
        Solution ob = new Solution();
        ob.isAnagram(s,t);
    }
}