package LinkedList;

public class LinkedList {
    private Node head;
    private int size;


    public LinkedList() {
        this.head = null;
        this.size = 0;
    }


    public LinkedList(Node head){
        this.head = head;
        this.size = 1;
    }

    /* add one node to the end of the list */
    public void add(Node node){
        if(head == null){
            head = node;
        }else{
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;

    }

    public void print( ) {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }


}
