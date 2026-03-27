package ListADT;

// LinkedBasedList implementation of ListADT
class LinkedBasedList implements ListADT {
    private Node head;
    private int size;

    // Constructor
    public LinkedBasedList() {
        head = null;
        size = 0;
    }

    // Adds an element at a specific index
    @Override
    public boolean add(int index, String s) {
        Node node = new Node(s);
        if (index < 0 || index > size) return false;
        if (index == 0) {
            node.setNext(head);
            head = node;
        }
        else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext(); // stop at node BEFORE index
            }
            node.setNext(current.getNext()); // new node points to the rest
            current.setNext(node);           // previous node points to new node
        }

        size++; // increase list
        return true;
    }

    // Removes an element at a specific index
    @Override
    public String remove(int index) {
        String toBeRemoved;
        if (index < 0 || index >= size) return "";
        if (index == 0) {
            toBeRemoved = head.getValue();
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            toBeRemoved = current.getNext().getValue();
            current.setNext(current.getNext().getNext());
        }
        size--; // shrink the list
        return toBeRemoved;
    }

    @Override
    //Clear the entire list and reset the size
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String print(String sep) {
        String result = "";
        Node current  = head;
        while(current!=null){
            if(!result.isEmpty()){
                result+= sep;
            }
            result+= current.getValue();
            current = current.getNext();
        }
        return result;
    }



    @Override
    public String getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " +
                    index + " is out of bounds.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }



}
