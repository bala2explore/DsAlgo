import java.lang.reflect.Array;

public class ArraySample {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 20;
        intArray[1] = 20;

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }


    }
}
