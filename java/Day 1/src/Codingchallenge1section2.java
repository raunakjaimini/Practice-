import java.util.Scanner;
public class Codingchallenge1section2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter body weight in Kgs:");
        Float weight = sc.nextFloat();
        System.out.println("Enter height in metres:");
        Float height = sc.nextFloat();
        System.out.println("BMI = "+ (weight/(height*height)));

    }
}
