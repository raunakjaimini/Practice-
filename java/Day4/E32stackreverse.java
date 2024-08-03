import java.util.Stack;

public class E32stackreverse {
    
    
    static void addBelow(int val, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(val);
            return;
        } 

        int temp = st.pop();
        addBelow(val, st);
        st.push(temp);
        

    }

    static void reverse(Stack<Integer> st){
        if(st.empty()) return;
        int curr = st.peek();
        st.pop();
        reverse(st);
        addBelow(curr, st);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.add(5);
        st.add(6);
        st.add(7);
        st.add(15);

        System.out.println("before: "+st);
        reverse(st);
        System.out.println("after"+ st);

    }
}
