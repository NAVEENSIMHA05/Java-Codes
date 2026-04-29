Interface 
interface is the place contains list of implemented methods but the not the actual implementation
it guide what are methods we implement
to create the interface we need to use "interface" keyword

interface Guidlines{
   public void audio();
    void video();
}
here interface is Guidelines and methods are audio and video but not contain implemented path
if a method does not mention access specifer then it consist as public not default
from java version 8 we can also insert implemented part in interface using access specifer "default and static"
*** A STATIC METHOD CAN BE IMPLEMENTED IN NON STATIC METHOD BUT NON STATIC METHOD CAP IMPLEMENT IN STATIC METHOD***


difference b/w class and interface
keyword- class keyword   interface
methods- class method with implemented part    method only not implemented part
acess specifer- no mention define default     no mention define public

interface Guidlines{
   public void audio();
    void video();
    default void copy(){
        System.out.println("default copy code ");
    }
    static void paste(){
        System.out.println("default paste code");
    }
    default void cut(){
        System.out.println("default cut code");
    }
}

 to implent the interface methods use "implements" keyword

 class Lenova implements Guidlines{
    public void audio(){
        System.out.println("Lenova audio code");
    }
    public void video(){
        System.out.println("lenova video code");
    }
    public void copy(){
        System.out.println("lenova copy code");
    }
}
 
