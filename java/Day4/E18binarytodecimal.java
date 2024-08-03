

import java.util.Scanner;
class E18binarytodecimal{
    public static void main(String[] args) {
        int binarynumber;
        int c=0;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number");
        binarynumber = sc.nextInt();

        while (binarynumber!=0){
            int d= binarynumber%10;
            c +=d*Math.pow(2,s);
            binarynumber /=10;
            s++;

        }

        System.out.println("Decimal number:"+ c);
        sc.close();

    }
}