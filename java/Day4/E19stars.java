import java.util.Scanner;

public class E19stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<5 || n>15) {

            System.out.println("Enter number between 5 and 15");
            System.exit(-1);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
