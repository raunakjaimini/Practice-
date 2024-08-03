public class E14countspacesinstring {
    public static void main(String[] args){
        String str="welcome123   456";
        char[] arr = str.toCharArray();
        int c = 0;
        int d =0;
        int s = 0;
        for (int i = 0; i<arr.length; i++){
            if (Character.isSpaceChar(arr[i])){
                s+=1;

            }
            else if (Character.isLetter(arr[i])){
                c+=1;

            }
            else if (Character.isDigit(arr[i])){
                d+=1;

            }


        }
        System.out.println("characters:"+c+" digits:"+d+" spaces:"+s);
    }
}
