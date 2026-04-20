import java.util.*;
class Fm{
   public void Fibonic(int n){
     int a = 0;
     int b=1;
     int temp;
     System.out.print(+a);
     for(int i= 1;i<n;i++){
        temp = a+b;
        a = b;
        b = temp;
        System.out.print(+a);
     }
    }
}
class Fib{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt(); 
        Fm ob = new Fm();
        ob.Fibonic(n);
    }
}