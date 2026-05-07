import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
       int count=0;
       mp.put(0,1);
       int prev=0;
       for(int num:nums){
            prev +=num;
            if(mp.containsKey(prev-k)){
                count += mp.get(prev-k);
            }
            mp.put(prev,mp.getOrDefault(prev,0)+1);
       }
       return count;
    }
}
class MaxSumSubArray{
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