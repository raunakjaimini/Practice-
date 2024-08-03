import java.util.Arrays;

public class E9insert {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,4,5,6,8};
        int newElement = 7;
        System.out.println("before = "+Arrays.toString(arr));

        int arrCopy[] = new int[arr.length+1];
        for(int i = 0 ;i<arr.length;i++){
            arrCopy[i] = arr[i];
        }

        arrCopy[arrCopy.length-1] = newElement;
        System.out.println("after = "+Arrays.toString(arrCopy));

    }
}
