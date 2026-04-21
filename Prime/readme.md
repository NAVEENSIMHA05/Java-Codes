Check weather the given number is prime or not 
if the number is onlly divisible by 1 and itself then that number is know as prime
example 1 2 3 5 7 11 13 17 ....
"n" variable is used to take input from user that number should check
 while(i<n){
        if(n%i!=0){
            i++;
        }
        else{
            res = false;
            i=n;
        }
  we also need to use boolean type data weather the number is prime or not
  "i" variable is used to divede the from 2 to n find weather is divisible with others
  according to the if condition if remainder is not zero then increment will happen otherwise i asign as 'n' value and res will become false
  if(res == true){
        System.out.println("the number is prime");
       }
       else{
        System.out.println("the number is not prime");
       }
  after checking the with all numbers if results stil true then it is prime otherwise false     
