
import java.util.Scanner;
public class E20millisecondsintodays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Milliseconds");
        long m = sc.nextLong();
        long s = m/1000;
        long mi = s/60;
        long hrs = mi/60;
        long days = hrs/24;

        hrs%=24;
        mi%=60;
        s%=60;
        System.out.println("Days="+days);
        System.out.println("Hours="+hrs);
        System.out.println("Minutes="+mi);
        System.out.println("Seconds="+s);
        sc.close();
    }
}