import java.util.*;
public class E12duplicates {
    static void findDuplicates(int[] arr){
        Arrays.sort(arr);
        int p = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        for(int i= 0;i<arr.length;i++){
            if(p==arr[i] && arr[i]!=l){
                System.out.println(arr[i]);
                l = arr[i];
            }else{
                p = arr[i];

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,8,8,3,1,4,7,4,6,5};

        findDuplicates(arr);
    }
}
