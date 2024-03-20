package lab1;

public class SwapWithout3rd {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swap a="+a+"B="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a="+a+"B="+b);
    }
}
