package lab6;

public class Fruits {
    public static void main(String[] args) {
     Apple ap1=new Apple();
     ap1.show();
     Apple ap2=new Banana();
     ap2.show();
     Apple ap3=new Cherry();
     ap3.show();
    }
}

class Apple{
    void show(){
        System.out.println(" Show Apple");
    }
}

class Banana extends Apple {
    void show(){
        System.out.println("Show banana");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("Show cherry");
    }
}