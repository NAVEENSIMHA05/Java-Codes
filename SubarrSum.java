import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int pre=0;
        int count = 0;
        for(int num: nums){
            pre += num;
            if(mp.containsKey(pre-k)){
                count +=mp.get(pre-k);
            }
            mp.put(pre,mp.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
class SubarrSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();    
        }
        Solution ob = new Solution();
    System.out.println(ob.subarraySum(nums,k));
    }
}