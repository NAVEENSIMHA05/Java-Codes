import java.util.*;
class Solution {
    private boolean weightArray(int[]products,int days,int weight){
        int d=1;
        int wt=0;
        for(int prod: products){
            if(wt+prod >weight){
                d++;
                wt=prod;
            }
            else{
                wt +=prod;
            }
        }
        return d<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
     int low=0;
     int high=0;
     for(int w: weights){
        low=Math.max(w,low);
        high +=w;
     }
     while(low<high){
        int mid=low+(high-low)/2;
        if(weightArray(weights,days,mid)){
            high=mid;
        }
        else{
            low=mid+1;
        }
     }
     return low;  
    }
}
class CapasityToShipPackage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.println(ob.shipWithinDays(arr,days));
    }
}