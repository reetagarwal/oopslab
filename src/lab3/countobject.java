package lab3;

//    WAP in JAVA to count no of objects created in a program with the help of static variable

public class countobject {
    static int count=0;
    countobject(){
        count++;
    }
        static void numberofobjects(){
            System.out.println("Number of objects: "+count);
        }

        public static void main(String[] args) {
            countobject a=new countobject();
            countobject b=new countobject();
            countobject.numberofobjects();
        }
}

