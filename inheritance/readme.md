Inheritence is one of the principle in opps concept
is the concept that allow class to acqurie the properties of parent class i means we use the parent class variable,methods
this extenstion will done using extends keyword
class Guest{
    void read(){
        System.out.println("read only");
    }
}
class Developer extends Guest{
    public void write(){
        System.out.println("write also");
    }
here the parent class is Guest and child class is Developer
the read method also be consinder for developer class
In inheritance concept multilevel will be possible but not multiple
multilevel inheritace means parent class to chlid class and child class also share peoperties to as a parent class to another child class
class Guest{
    void read(){
        System.out.println("read only");
    }
}
class Developer extends Guest{
    public void write(){
        System.out.println("write also");
    }
}
class Admin extends Developer{
    public void manage(){
        System.out.println("mange possible");
    }
    void read(){
        super.read();
        System.out.println("admin block read");
    }
}
but multiple will not possible we can not acquire from 2 classes for multple we need use interface
class Admin extends Developer,Guest{
    public void manage(){
        System.out.println("mange possible");
    }
    void read(){
        super.read();
        System.out.println("admin block read");
    }
}
not posible
    
