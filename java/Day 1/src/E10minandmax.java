public class E10minandmax {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,3,3,224,33};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int j = 0;j<arr.length;j++){
            if (arr[j]<min){
                min=arr[j];

            }
        }
        System.out.println("max element:"+max+" "+"min element: "+ min);
    }
}
