Fibonacci Series,
example series 0,1,1,2,3,5,8,13,21,34
n variable represent no.of elements should want
here we use for loop because we know the no of interation
in this code the logic is writen in the method called "Fibonacci" it is no return type ,acess specifer as public, non static to call the method we need create the object
the main logic is we need add last two numbers to find third digit
for(int i= 1;i<n;i++){
        temp = a+b;
        a = b;
        b = temp;
        System.out.print(+a); 
"i" check the condition
"temp" to store the sum of last two digits 
"a & b" will change (a=b; b=temp;)
a variable will store
