public class E29transformiterativetorecursive {
    public static void main(String[] args) {

        recursive(2,3  );
    }
    public static void recursive(int a, int b){

        if(a<4){

            if(b<10){

                System.out.println((a+b*10));
                recursive(a,b+1);
            }
            else{

                recursive(a+1,b);
            }
        }
    }

}
