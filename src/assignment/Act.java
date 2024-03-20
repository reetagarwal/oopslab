package assignment;

//Write a program to create an Account class containing acc_no, balance as data members and
//display() to display account details. Inherit it in Person class with all mentioned data members and
//functions. Person class also has name and aadhar_no as extra data members of its own. Override
//display() function of person’s class. Test your program with minimum 5 persons details.
public class Act {
    public static void main(String[] args) {
        Person p1=new Person(101,34.5,"Reet",9876543);
        Person p2=new Person(102,5243,"Rishit",890589);
        Person p3=new Person(103,36970,"Ritesh",5679860);
        Person p4=new Person(104,4875,"Ayush",325621);
        Person p5=new Person(105,896705,"Preet",748332331);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}

class Account{
    double acc_no;
    double balance;

    public Account(double acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void display(){
        System.out.println("Account number is:"+acc_no);
        System.out.println("Balance is :"+balance);
    }
}

class Person extends Account{
    String name;
    int aadhar_no;

    public Person(double acc_no, double balance,String name,int aadhar_no ){
        super(acc_no, balance);
        this.name=name;
        this.aadhar_no=aadhar_no;
    }
    void display(){
        super.display();
        System.out.println("Name is:"+name);
        System.out.println("Aadhar number is:"+aadhar_no);
    }
}
