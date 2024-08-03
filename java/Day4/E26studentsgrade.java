import java.util.Scanner;
public class E26studentsgrade {
    public static void main(String[] args){
        String[][] student = new String[30][3];
    student = enter(student);
    
        print(student);
  }

  private static String[][] enter(String[][] array){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Details:");
    for(int i=0; i<array.length;i++){
        System.out.println("Student"+(i+1));

        System.out.print("S. No");
    array[i][0]=sc.nextLine();

System.out.print("Enter Name:");
array[i][1] = sc.nextLine();

System.out.print("Enter Grade");
array[i][2] = sc.nextLine();

System.out.println();}

sc.close();
return array;
    }

    private static void print(String[][] array){
        for ( int i= 0;i<array.length;i++){
            System.out.printf(array[i][0],array[i][1],array[i][2]);

        }
    }


  }
    
    

