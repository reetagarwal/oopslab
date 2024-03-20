package lab2;

//WAP in Java to create a student class having data members
// Roll No, Name, Fees and University with 3 Subjects Marks
// and functions-void input,void display,void find average(total of 3 sub marks ka average)


public class Stu {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input("Reet",2205057,"KIIT",25000,94,95,89);

        s1.findAvg();
        s1.display();
    }
}
class Student{
    int rollno;
    String name;
    String univ;
    double fees;
    double m1,m2,m3;
    double average;

    void input(String name,int rollno,String univ,double fees,double m1,double m2,double m3){
        this.name=name;
        this.rollno=rollno;
        this.univ=univ;
        this.fees=fees;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void display(){
        System.out.println("Name is:"+name);
        System.out.println("Roll number is:"+rollno);
        System.out.println("University name is:"+univ);
        System.out.println("Fees is:"+fees);
        System.out.println("Marks of first subject is:"+m1);
        System.out.println("Marks of second subject is:"+m2);
        System.out.println("Marks of third subject is:"+m3);
        System.out.println("average is"+average);
    }
    void findAvg(){
        this.average=(m1+m2+m3)/3;
    }
}
