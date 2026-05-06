import java.lang.*;
import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int max_profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
               buy=prices[i];    
            }
            else{
                profit = prices[i]-buy;
            }
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
class BestTimeToBuySell{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n;i++){
            prices[i]=sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.println(ob.maxProfit(prices));
    }
}