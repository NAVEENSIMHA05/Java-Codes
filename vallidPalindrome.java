class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        return true;
    }
}
class VaildPalindrome{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.isPalindrome(s));
    }
}