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
        //add your implementation
        return true;
    }

    // Removes an element at a specific index
    @Override
    public String remove(int index) {
        //add your implementation
        return "";
    }

    @Override
    //Clear the entire list and reset the size
    public void clear() {
        // add your implementation
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
