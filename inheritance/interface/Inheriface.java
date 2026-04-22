interface Guest{
    public void read();
}
interface Developer extends Guest{
    public void write();
}
interface Admin extends Guest,Developer{
   public void manage();
}
class User implements Admin{
    public void read(){
        System.out.println("read code");
    }
    public void write(){
        System.out.println("write code");
    }
    public void manage(){
        System.out.println("manage also");
    }
}
public class Inheriface{
    public static void main(String[] args) {
        User us = new User();
        us.read();
        us.write();
        us.manage();
    }
}