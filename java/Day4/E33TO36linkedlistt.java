public class E33to36linkedlistt {
    private Node head,tail;
    private int size=0;
    

    boolean add(int val){
        Node n = new Node(val);
        if(tail == null && head == null){
            tail = head = n;
            return true;
        }
        
        size++;
        tail.next = n;
        tail = tail.next;
        return true;
    }
    
    int get(int idx){
        if(tail == null) return -1;
        Node curr = head;
        while(curr!=null){
            if(idx-- ==0) return curr.val;
            else curr= curr.next;
        }
        return -1;
    }

    boolean remove(int idx){
        if(tail!=null){
            Node curr = head;
            Node prev = null;
            while(curr!=null){
                if(idx-- ==0) {
                    if(prev == null) return false;
                    prev.next = curr.next;
                    return true;

                } else{
                    prev = curr;
                    curr = curr.next;
                }

            }
        }
        return false;
    }

    int size(){
        return this.size;
    }


   
    int find(int val){
        Node n = head;
        return findUtil(n, val,0);
    }
    int findUtil(Node curr, int val,int idx){
        if(curr==null) return -1;
        if(curr.val==val) return idx;
        return findUtil(curr.next, val, idx+1);

    }


    
    void printAll(){
        Node n = head;
        printUtil(n);
    }
    void printUtil(Node curr){
        if(curr== null){
            System.out.println();
            return;
        } 
        System.out.print(curr.val+" ");
        curr = curr.next;
        printUtil(curr);
    }


    
    void addRecursive(int val){
        if(head==null){
            tail = head = new Node(val);
            return;
        }
        Node n = head;
        addRecursiveUtil(val, n,null);
    }
    void addRecursiveUtil(int val, Node curr, Node prev){
        if(curr == null){
            prev.next = new Node(val);
            tail = tail.next;
            return;
        }
        
        addRecursiveUtil(val, curr.next, curr);

    }


 
    
    public static void main(String[] args) {
        E33to36linkedlistt linkedList = new E33to36linkedlistt();
        linkedList.addRecursive(15);
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(6);

        linkedList.add(7);

        linkedList.add(10);

        linkedList.addRecursive(27);

        

        System.out.println(linkedList.get(4));
        System.out.println(linkedList.find(155));
        linkedList.printAll();
        linkedList.remove(2);
        linkedList.printAll();
    }
}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}