package ListADT;

// ArrayBasedList implementation of ListADT
public class ArrayBasedList implements ListADT {

    private String[] list;
    // The number of elements currently on the list
    private int size;
    // Initial capacity of the array
    private static final int INITIAL_CAPACITY = 3;

    public ArrayBasedList() {
        list = new String[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(int index, String s) {
        if (index < 0 || index > size) return false;
        if (size == list.length) resize();
        for(int i = size; i > index ; i--) {
            list[i] = list[i-1];
        }
        list[index] = s;
        size++;
        return true;
    }


    @Override
    public String remove(int index) {
        if (index < 0 || index >= size) return "";
        for (int i = size; i > index ; i--) {
            if (i == index) {
                list[i] = "";
            }
        }
        return "";
    }

    @Override
    public void clear() {
        // add your implementation
    }

    @Override
    public String print(String sep) {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (!result.isEmpty()) {
                result += sep;
            }
            result += list[i];
        }
        return result;
    }


    @Override
    public String getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " +
                    index + " is out of bounds.");
        }
        return list[index];
    }

    // a Helper method that resizes the array to a new capacity
    private void resize( ) {
        String[] newList = new String[list.length * 2];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

}
