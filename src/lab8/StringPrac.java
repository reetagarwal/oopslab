package lab8;

import java.util.Arrays;

public class StringPrac {
    public static void main(String[] args) {
        String a="Reet";
        String b="reet";
        System.out.println(a.equals("Reet"));
        System.out.println(a==b);
        System.out.println(a.compareTo(b));
        System.out.println(a.concat(" agarwal"));
        System.out.println(a+" agarwal");
        System.out.println(a.charAt(0));
        System.out.println(a.length());
        System.out.println(a.contains("R"));
        System.out.println(String.format("value of %4.2f",122.1));
        byte []by=a.getBytes();
        for (int i = 0; i < by.length; i++) {
            System.out.print( by[i]+" ");
        }
        System.out.println();
        System.out.println(a.indexOf("R"));
        String c=a.intern();
        System.out.println(c);
        System.out.println(a.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(String.join(",","reet","ritesh","ayush"));
        System.out.println(a.replace("t",""));
        String [] sp=("My name is Reet").split("\\s");
        for(String i:sp){
            System.out.println(i);
        }
        System.out.println(a.substring(1));
        System.out.println(a.substring(0,3));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println("      abc".trim());
        System.out.println(String.valueOf(12));
        int arr[]=new int[2];
        arr[0]=1;
        arr[1]=2;
        System.out.println(Arrays.toString(arr));
    }
}
