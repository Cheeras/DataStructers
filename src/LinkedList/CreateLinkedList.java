package LinkedList;

/**
 * Created by cheeras on 11/29/17.
 */
public class CreateLinkedList {
    Node head;

    public void append(int data){

        if(head==null){
            head= new Node(data);
            return;
        }
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(data));
    }

    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void deleteWithValue(int data){

        if(head==null) return;
        if(head.getData() == data){
            head = head.getNext();
            return;
        }
        Node current = head;
        while(current.getNext() != null){
            if(current.getNext().getData() == data){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public String toString(){
        String result="";
        Node current = head;
        while(current!=null){
            result+=current.getData() + "\n";
            current = current.getNext();
        }
        return  result;
    }


    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(11);
        list.append(22);
        list.prepend(5);
        list.deleteWithValue(40);

        System.out.println(list);
    }
}