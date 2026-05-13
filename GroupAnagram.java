import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List> mp = new HashMap<>();
        for(String str: strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String k= new String(ch);
            if(!mp.containsKey(k)){
                mp.put(k,new ArrayList<String>());
            }
            mp.get(k).add(str);
        }
        return new ArrayList(mp.values());
    }
}
class GroupAnagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[] arr = new String[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.next();
        }
        Solution ob = new Solution();
        System.out.println(ob.groupAnagrams(arr));
    }
}