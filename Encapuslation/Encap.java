class Student{
    int rollno;
    String name;
    boolean isattend;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void attendence(boolean isattend){
        this.isattend=isattend;
    }
    
}
class Encap{
    public static void main(String[] args) {
        Student st = new Student();
        st.setRollno(170);
        st.setName("Nani");
        st.attendence(false);
         if(st.isattend==true){
            System.out.println(st.getRollno());
            System.out.println(st.getName());
            System.out.println("the student is present");
        }
        else{
            System.out.println(st.getRollno());
            System.out.println(st.getName());
            System.out.println("the student is absent");
        }

    }
}