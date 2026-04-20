import java.util.*;
class Prime{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
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
       if(res == true){
        System.out.println("the number is prime");
       }
       else{
        System.out.println("the number is not prime");
       }
    }
}