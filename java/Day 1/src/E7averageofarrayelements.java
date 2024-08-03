public class E7averageofarrayelements {
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,1};
        int avg = 0;
        for (int i = 0; i< arr.length;i++){
            avg+=arr[i];

        }
        avg = avg/arr.length;
        System.out.println(avg);

    }
}
