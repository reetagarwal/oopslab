package lab8;
import java.lang.*;
public class Q2 {
    public static void main(String[] args) {
        String a="The Dog is playing in the garden" ;
        StringBuffer abc=new StringBuffer();
        abc.append(a);
        String[] words =  a.split("\\s");
        String rev = "";
        for(int i = words.length - 1; i >= 0 ; i--)
        {
            rev += words[i] + " ";
        }
        System.out.println(rev);
        String rep=a.replace("Dog","Cat");
        System.out.println(rep.replace("garden","kitchen"));
        abc.delete(0,4);
        System.out.println( abc.delete(7,15));
    }
}
