package lab5;

//WAP to create a class student having data members roll no , name , branch , university and functions get and
// display - to input student details and display. Derive a class marks from student class having data members 5
// subject marks and members functions find total and find average . Now create an object of derived class(marks)
// and call functions of student and marks class.
public class Stu {
    public static void main(String[] args) {
        Marks mark=new Marks(new int[]{34,56,78,90,21});
        mark.display();
        System.out.println(mark.total());
        System.out.println(mark.average());
    }
}

class Student{
    int roll;
    String name;
    String branch;
    String univ;

    void get(int roll,String name,String branch,String univ){
        this.roll=roll;
        this.name=name;
        this.branch=branch;
        this.univ=univ;
    }

    void display(){
        System.out.println("Roll number is :" + roll);
        System.out.println("Name is :" + name);
        System.out.println("Branch is :" + branch);
        System.out.println("University name is :" + univ);
    }
}

class Marks extends Student{
    int [] marks1;

     Marks(int[] marks1) {
         super.get(2205057,"reet","CSE","KIIT");
         this.marks1 = marks1;
     }

     int total(){
         int sum=0;
         for(int i:marks1){
             sum+=i;
         }
         return sum;
     }

     double average(){
         int sum=total();
         return (double) sum/5;
     }
}
