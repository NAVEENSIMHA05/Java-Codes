class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=0;
        while(i<j){
            int width=j-i;

            area=Math.max(area,width*Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
}
class ContainerMax{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int[] height= new int[n];
    for(int i=0; i<n ;i++){
        height[i]=sc.nextInt();
    }
    Solution ob = new Solution();
    System.out.println(ob.maxArea(height));
    }
}