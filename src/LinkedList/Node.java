package LinkedList;

/**
 * Created by cheeras on 11/29/17.
 */
public class Node {

     private int data;
     private Node next;
     Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
