class WithVar{
    public int[] withVar(int[]arr){
     int[] pre = new int[arr.length];
     pre[0] = arr[0];
     for(int i=1; i< arr.length ; i++){
        pre[i]=pre[i-1]+arr[i];
     }
      return pre;
    }
    public int[] withOutVar(int[]arr){
     for(int i=1; i< arr.length ; i++){
        arr[i]=arr[i-1]+arr[i];
     }
      return arr;
    }
}

class Prefix{
    public static void main(String[] args){
         int arr[]={10,20,30,50,90};
         WithVar ob = new WithVar();
         int[] res = ob.withVar(arr);
         for(int j:res){
            System.out.println(j);
         }
         int[] ros = ob.withOutVar(arr);
         for(int j:ros){
            System.out.println(j);
         }
    }     
}