public class Operators {
    public static void main(String[] args){
        int a = 5;
        int b = 8;
        System.out.println("arithmetic operator");
        System.out.println("+ = "+ (a+b));
        System.out.println("- = " + (a-b));
        System.out.println("* = "+ (a*b) );
        System.out.println("/ = "+ (a/b) );
        System.out.println("% = "+ (a%b) );
        System.out.println("unary  operator");
        System.out.println("-a = " + (-a));
        System.out.println("+a = " + (+a));
        System.out.println("(++a)+b) = " + ((++a)+b));
        System.out.println("((a++)+b)) = " + ((a++)+b));
        System.out.println("((--a)+b)) = " + ((--a)+b));
        System.out.println("((a--)+b)) = " + ((a)+b));

        int c = 6 ;
        int d = 3;
        System.out.println("bitwise operator");

        System.out.println("c&d = "+(c&d));
        System.out.println("c|d = "+(c|d));
        System.out.println("c^d = "+(c^d));
        System.out.println("~d = "+(~d));
        int e = 4;
        System.out.println("shift operator");
        System.out.println("e<< = " + (1<<e));
        System.out.println("e>> = " + (e>>1));


    }
}
