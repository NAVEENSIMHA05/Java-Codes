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
public class Inherit{
    public static void main(String[] args) {
        Guest obj1 = new Guest();
        Developer obj2 = new Developer();
        Admin obj3 = new Admin();
        obj1.read();
        System.out.println("Developer works");
        obj2.read();
        obj2.write();
        System.out.println("Admin works");
        obj3.read();
        obj3.write();
        obj3.manage();
    }
}