package muchiri;

public class Student {
    String name;
    int roll_no;
    int address;
    int phone;

}
class Main{
    public static void main(String[] args){
Student student1=new Student();
        Student student2=new Student();
student1.name="John";
student1.roll_no=2;
        student1.address=167732;
        student1.phone=0763567747;

        student2.name="Sam";
        student2.roll_no=3;
        student2.address=1032;
        student2.phone=0763654747;

        System.out.println(student1.name);
        System.out.print(student1.address+"\n"+student1.roll_no+"\n"+student1.phone+"\n\n");


        System.out.println(student2.name);
        System.out.print(student2.address+"\n"+student2.roll_no+"\n"+student2.phone);


    }
}
