import java.util.*;
class Check{
    public static boolean  primeMethod(int n){
        boolean res = true;
    int i =2;
       while(i<n){
        if(n%i!=0){
            i++;
        }
        else{
            res = false;
            i=n;
        }
     }
         return res;
    }
}
class Prime{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    if(n>2){
        System.out.println(Check.primeMethod(n));
    }
    else if(n==2){
        System.out.println("true");
    }
    else{
        System.out.println("enter correct number");
      }
    
    }
}