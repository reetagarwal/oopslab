package lab2;
//WAP in Java to create a Class Employee having data members -
//Name, ID , Basic Salary , Company Name
//with functions – void display (),get(), Gross Salary() .
//Gross Salary is made up of - DA= 30% of basic salary, HRA=10%of basic salary , TA= 3% of basic salary ,
// Gross Salary is sum of Basic Salary and above 3 mentioned .


public class Employee {
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.get("Reet",2205057,20000,"GOOGLE");
        e1.display();
        e1.grossSalary();

    }
}

class Emp{
    String name;
    int id;
    float salary;
    String companyName;

    void get(String name,int id,float salary,String companyName){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.companyName=companyName;
    }

    void display(){
        System.out.println("Name is:"+name);
        System.out.println("Id is:"+id);
        System.out.println("Basic salary is:"+salary);
        System.out.println("Company name is:"+companyName);
    }

    void grossSalary(){
        double da,hra,ta,gross;
        da=0.03*salary;
        hra=0.01*salary;
        ta=0.003*salary;
        gross=salary+da+hra+ta;
        System.out.println("Total gross salary is:"+gross);
    }
}
