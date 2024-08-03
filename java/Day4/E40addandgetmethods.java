class E40addandgetmethods {
    public static void main(String args[]){
        GenericLinkedList<Integer> list = new GenericLinkedList<>();


        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("List elements: ");

        
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        
    }
    
}

class GenericNode<T> {
    T data;
    GenericNode<T> next;



    public GenericNode(T data) {
        this.data = data;
        this.next = null;
    }
}
 class GenericLinkedList<T> {
    private GenericNode<T> head;

    public void add(T data) {

        
        GenericNode<T> newNode = new GenericNode<>(data);
        if (head == null) {
            head = newNode;
        } else {


            GenericNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public T get(int index) {
        GenericNode<T> current = head;
        int count = 0;


        while (current != null) {
            if (count == index) {
                return current.data;
            }


            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }

    public void display() {


        GenericNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }


        System.out.println();
    }
}


