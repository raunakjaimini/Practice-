import java.util.Arrays;

public class E31sumtriangle {
    public static void main(String[] args) {

        int[] A={1,2,3,4,5};
        print(A);
    }
    public static void print(int[] A){
        if(A.length==0){
            return;
        }
        int temp[]= new int[A.length-1];
        for(int i=0; i<A.length-1; i++){

            int x=A[i]+A[i+1];
            temp[i]=x;
        }
        print(temp);
        System.out.println(Arrays.toString(A));
    }
}
