package lab4;

//Wap in Java to create a class complex having data members real and imaginary. Take default constructor to
// initialize real and imaginary values to zero and parameterized constructor to initialize real and imaginary
// values. Take another parameterized constructor which receives two complex objects and add and subtract these
// two complex members.
public class RealImaginary {
    public static void main(String[] args) {
        complex a =new complex(1,1);
        complex b=new complex(2,2);
        complex c=new complex(a,b,'+');
        System.out.println(c.real+"+"+c.imaginary+"i");
    }
}

class complex{
    int real;
    int imaginary;

    complex(){
        this.real=0;
        this.imaginary=0;
    }
    complex(int r,int i){
        this.real=r;
        this.imaginary=i;
    }
    complex(complex a,complex b,char ch){
        if(ch=='+'){
            this.real=a.real+b.real;
            this.imaginary=a.imaginary+b.imaginary;
        }
        else{
            this.real=a.real-b.real;
            this.imaginary=a.imaginary-b.imaginary;
        }
    }
}
