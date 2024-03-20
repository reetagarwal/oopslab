package lab2;

class Acct {
    long accNo;
    String name;
    String branch;
    String bankName;
    double balance;


    void input(long accNo, String name, String branch, String bankName, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.branch = branch;
        this.bankName = bankName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Name is:" + name);
        System.out.println("lab2.Acct.Account number is:" + accNo);
        System.out.println("Branch is:" + branch);
        System.out.println("Bank name is:" + bankName);
        System.out.println("balance is:" + balance);
    }

    void withdraw(double w) {
        balance = balance - w;
        System.out.println("After withdrawal:" + balance);
    }

    void deposit(double d) {
        balance = balance + d;
        System.out.println("After deposit:" + balance);
    }
}

    public class Account {
        public static void main(String[] args) {
            Acct a1=new Acct();
            a1.input(12345,"Reet","CR","HDFC",400);
            a1.display();
            a1.withdraw(20);
            a1.deposit(30);
            //        a1.display();
        }
    }


