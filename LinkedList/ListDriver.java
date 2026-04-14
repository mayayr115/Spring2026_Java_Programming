package LinkedList;

public class ListDriver {

    public static void main(String[] args) {

        Node n = new Node(1);
        n.setNext(new Node(5));

        System.out.println(n.getData());
        System.out.println(n.getNext().getData());

        System.out.println(n.getNext().getNext().getData());//


    }


}
