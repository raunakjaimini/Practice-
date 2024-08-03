import java.util.Scanner;

public class E28meterologist {
    static String[] days= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
    static double[][] temps= new double[7][4];

    public static int EnterDay(String j){
        for(int i=0; i<7; i++){

            if(j.toLowerCase().equals(days[i])){
                    return i;
            }
        }
        return 0;
    }
    public static void EnterTemp(){

        Scanner sc= new Scanner(System.in);

        for(int i=0; i<temps.length; i++){

            for(int j=0; j<temps[i].length; j++){
                System.out.println("Temp["+i+"]["+j+"]");
                temps[i][j] = sc.nextDouble();
            }

        }
    }
    public static double AvgtempDay(String j){
        int n=EnterDay(j);
        double s=0.0;
        for(int i=0; i<temps[n].length; i++){
            s+=temps[n][i];
        }
        return s/temps[n].length;

    }
    public static String[] hottestDays(double t){
        String[] jp= new String[temps.length];
        int j=0;
        for(int i=0; i<temps.length; i++){
            if(AvgtempDay(days[i])>=t){
                jp[j++]=days[i];
            }
        }
        return jp;
    }

    public static void main(String[] args) {
        int dayno=EnterDay("friday");
        System.out.println(dayno);
        EnterTemp();
        double av= AvgtempDay("tuesday");
        System.out.println(av);
    }
}
