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
  class Hp implements Guidlines{
    public void audio(){
        System.out.println("HP audio code");
    }
    public void video(){
        System.out.println("HP video code");
    }
    public void cut(){
        System.out.println("hp cut code");
    }
    public void paste(){
        System.out.println("hp paste code");
    }
}
 public class Laptop{
    public static void main(String[] args) {
        Lenova le = new Lenova();
        Hp hp = new Hp();
        le.audio();
        le.copy();
        le.video();
        le.cut();
        Guidlines.paste();
        System.out.println("     ");
        System.out.println("hp things");
        hp.audio();
        hp.copy();
        hp.video();
        hp.cut();
        hp.paste();
        Guidlines.paste();
    }
}