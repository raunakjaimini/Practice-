
import java.util.Scanner;
class Factori{
    int fact(int n)
    {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
class Factorial {
    public static void main(String[] args)
    {
        Factori q = new Factori();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("answer " + q.fact(n));
    }
}