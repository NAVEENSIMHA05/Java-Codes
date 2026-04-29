interface Guidlines{
   public void audio();
    void video();
    void copy();
    void paste();
    void cut();
}
    abstract class Auto implements Guidlines{
       public void copy(){
            System.out.println("Abstract copy code");
        }
        public void cut(){
            System.out.println("Abstract cut code");
        }
        public void paste(){
            System.out.println("Abstract paste code");
        }
        public abstract void video();
        public abstract void audio();
    }
    class Lenova extends Auto{
    public void audio(){
        System.out.println("Lenova audio code");
    }
    public void video(){
        System.out.println("lenova video code");
    }
}
  class Hp extends Auto{
    public void audio(){
        System.out.println("HP audio code");
    }
    public void video(){
        System.out.println("HP video code");
    }
}
 public class Laptopabs{
    public static void main(String[] args) {
        Lenova le = new Lenova();
        Hp hp = new Hp();
        le.audio();
        le.copy();
        le.video();
        le.cut();
        System.out.println("     ");
        System.out.println("hp things");
        hp.audio();
        hp.copy();
        hp.video();
        hp.cut();
        hp.paste();
    }
}