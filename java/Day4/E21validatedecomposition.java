import java.util.Scanner;

public class E21validatedecomposition {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a 8digit number: ");
        long num = sc.nextLong();
        int year = (int) (num%10000);
        int month = (int)((num/10000)%100);
        int day = (int)(num/1000000);
        boolean valid = valid(day,month,year);

        if (valid){
            System.out.println("date:"+day+"/"+month+
            "/"+year+"(valid)");

        }
        else{
            System.out.println("date:"+day+"/"+month+
            "/"+year+"(not valid)");
        }

        sc.close();



    }
    private static boolean valid(int day, int month, int year){
        if (year<1 || month<1 || month>12 || day<1){
            return false;
        }

        int maxx = 31;
        switch (month){
            case 2: maxx = (year%4==0 && (year%100!=0 || year%400==0))? 29:28;
            break;
            case 4:
            case 6:
            case 9:
            case 11: maxx = 30;
            break;

        
        }
        return day<=maxx;

    }
    
}

