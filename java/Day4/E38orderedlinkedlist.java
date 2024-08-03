import java.util.HashSet;
import java.util.Set;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class OULL<T> {
    private Node<T> head;
    private Set<T> set;

    public OULL() {
        this.head = null;
        this.set = new HashSet<>();
    }

    public void add(T data) {
        if (set.contains(data)) {
            return; 
        }

        set.add(data);
        Node<T> newNode = new Node<>(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T data) {
        if (!set.contains(data)) {
            return; 
        }

        set.remove(data);
        
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class E38orderedlinkedlist{
    public static void main(String args[]){
        OULL<Integer> list = new OULL<>();
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2); 
        list.add(4);
        list.add(3); 

        
        System.out.print("List after adding elements: ");
        list.display();

        
        list.remove(2);
        System.out.print("List after removing element 2: ");
        list.display();

        list.remove(5); 
        System.out.print("List after trying to remove element 5: ");
        list.display();

    }
}

