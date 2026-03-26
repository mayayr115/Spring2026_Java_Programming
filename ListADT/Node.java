public class Node {

    private String value;
    private Node next;

    public Node(String value){
        this.value = value;
    }

    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
