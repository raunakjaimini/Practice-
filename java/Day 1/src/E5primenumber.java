import java.util.Scanner;

public class E5primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean q = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    q = false;
                    break;
                }
            }
            if (q) {
                System.out.println(i + " " );
            }
        }
    }
}




