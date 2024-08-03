
import java.util.*;
class E37insertionbw2sets {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=2;i<n;i+=2){
            set1.add(i);
            
        }
        for(int i=1;i<n;i++){
            set2.add(i);
            
        }
        HashSet<Integer> intersect=new HashSet<>(set1);
        intersect.retainAll(set1);
        System.out.println(intersect);
        

        


    }



    
}
