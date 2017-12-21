package LinkedList;

/**
 * Created by cheeras on 12/21/17.
 * Reversing singly linked list
 */
public class ReversingSinglyLinkedList {
    static Node head;


    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }


    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReversingSinglyLinkedList list = new ReversingSinglyLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.println("Before list is ");
        list.printList(head);
        head = list.reverse(head);
        System.out.println();
        System.out.println("Reversed list is");
        list.printList(head);
    }
}
