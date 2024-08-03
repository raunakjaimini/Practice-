import java.util.Scanner;
public class E25divisibility {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer");
        int x = sc.nextInt();
        System.out.print("Enter 2nd integer");
        int y = sc.nextInt();
        int count = 0;
        if(y==0) throw new Exception("division by zero not allowed");
        while(x%y==0){
                count++;
                x /= y;
        }
        if(count==0) System.out.println(-1);
        else System.out.println(count);
        
        
        
        }


    
}
