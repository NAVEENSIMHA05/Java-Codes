class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha = new int[26];
        for(char ch: magazine.toCharArray()){
            alpha[ch-'a']++;
        }
        for(char ch: ransomNote.toCharArray()){
            if(alpha[ch-'a']==0){
                return false;
            }
            alpha[ch-'a']--;
        }
        return true;
    }
}
class Ransom{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String ransomNote= sc.next();
        String magazine= sc.next();
        Solution ob = new Solution();
       System.out.println(ob.canConstruct(ransomNote,magazine));
    }
}