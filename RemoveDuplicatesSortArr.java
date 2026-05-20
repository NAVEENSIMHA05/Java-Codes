class Solution {
    public int removeDuplicates(int[] nums) {
     int k=2;
     for(int i=2;i<nums.length;i++){
        if(nums[i]!=nums[k-2]){
            nums[k]=nums[i];
            k++;
        }
     }
     return k;   
    }
}
class RemoveDuplicateSortArr{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.println(ob.removeDuplicates(arr));
    }
}