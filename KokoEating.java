import java.util.*;
class Solution {
    private boolean canEat(int[] piles,int h,int s){
        int hr=0;
        for(int p: piles){
            hr += (int)Math.ceil((double)p/s);
        }
        return hr<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int pile : piles){
            max= Math.max(pile,max);
        }
        while(min<max){
            int mid=min+(max-min)/2;
            if(canEat(piles,h,mid)){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
    
}
class KokoEating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h= sc.nextInt();
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob = new Solution();
        ob.minEatingSpeed(arr,h);
    }
}