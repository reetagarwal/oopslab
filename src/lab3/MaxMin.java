package lab3;

public class MaxMin {
    public static void main(String[] args) {
        int[] array={1,2,3,45,63,0,89};
        System.out.println("Max array is:"+max(array));
        System.out.println("Min array is:"+min(array));
    }
    public static int max(int[] array){
        int max=0;
        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array){
        int min=0;
        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
}
