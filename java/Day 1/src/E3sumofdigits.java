import java.util.Scanner;
public class E3sumofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int r = 0;
        while(n>0){
            r = n%10;
            s=s+r;
            n = n/10;

        }
        System.out.println(s);
    }
}