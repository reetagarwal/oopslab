package lab8;


public class Builderss {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder();
        a.append("Reet");
        a.append(" agarwal");
        System.out.println(a);
        System.out.println(a.replace(4,6," "));
        System.out.println(a.delete(4,6));
        System.out.println(a.reverse());
        System.out.println(a.capacity());
        a.ensureCapacity(23);
        System.out.println(a.charAt(1));
        System.out.println(a.length());
        System.out.println(a.substring(2));
        a.reverse();
        System.out.println(a.insert(4,"it "));
    }
}
