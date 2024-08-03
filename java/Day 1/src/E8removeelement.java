import java.util.Scanner;
public class E8removeelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("index to remove");
        int index= sc.nextInt();
        if(index==0){
            int ans[]= new int[n-1];
            for(int i=0; i<n-1; i++){
                ans[i]=arr[i+1];
            }
            for(int i=0; i<ans.length; i++){
                System.out.print(ans[i]+" ");
            }
        }
        else if(index==n-1){
            int ans[]= new int[n-1];
            for(int i=0; i<n-1; i++){
                ans[i]=arr[i];
            }
            for(int i=0; i<ans.length; i++){
                System.out.print(ans[i]+" ");
            }
        }
        else{

            for(int i=index; i<n-1; i++){
                arr[i]=arr[i+1];
            }
            for(int i=0; i<n-1; i++){
                System.out.print(arr[i]+" ");
            }

        }
    }
}