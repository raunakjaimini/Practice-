public class E30iterativetorecursive {
    public static void main(String[] args) {

        System.out.println(rec(5));
    }
    public static int rec(int x){
        if(x<0){

            return 0;
        }
        if(x==0) return 1;
        
        return rec(x-1)*5+1;
    }
}
