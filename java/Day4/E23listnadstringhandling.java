import java.util.ArrayList;
import java.util.Scanner;

public class E23listnadstringhandling {

    static ArrayList<String> d= new ArrayList<>();
    static ArrayList<String> j = new ArrayList<>();
    static ArrayList<String> l = new ArrayList<>();


    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the word: ");
                String s = sc.nextLine();
                boolean check= beginwithletter(s);
                if (check) {
                    System.out.println("Your word begins with a letter");
                }
                else{
                    System.out.println("Your word doesnot begin with a letter");
                }
           boolean a= containslegal(s);
        System.out.println(a);
    }


    //1
    public static boolean beginwithletter(String s){
        return Character.isLetter(s.charAt(0));
    }


    //2
    public static boolean containslegal(String s){
        for(int i=0; i<s.length(); i++){
            if(!l.contains(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    //3
    public static boolean notreverse(String s){
        return !j.contains(s);
    }

    //4
    public static int occurence(ArrayList<String> lst,String s){
        int counter=0;
        for(int i=0; i<lst.size(); i++){
            if(s.equals(lst.get(i))){
                counter++;
            }
        }
        return counter;
    }

    //5
    public static boolean exists(String s){
        return occurence(declared,s) ==1;
    }


}
