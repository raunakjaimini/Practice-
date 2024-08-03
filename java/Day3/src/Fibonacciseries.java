import java.util.*;
public class Fibonacciseries {
    public static int fi(int n){
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
             return 1;}
        return fi(n-1) + fi(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fi(n));
    }
}