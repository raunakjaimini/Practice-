public class E15reverseastring {
    public static void main(String[] args){
        String str = "welcome";
        String updated = "";
        for (int i =0 ; i<str.length();i++){
            updated = str.charAt(i) + updated;
        }
        System.out.println(updated);

    }
}
