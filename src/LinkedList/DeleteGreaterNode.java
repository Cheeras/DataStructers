package LinkedList;

/**
 * Created by cheeras on 12/21/17.
 */
public class DeleteGreaterNode extends CreateLinkedList {
     Node head;

    public static void main(String[] args) {
        DeleteGreaterNode list = new DeleteGreaterNode();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);


        System.out.println("Before deleting...");

        list.printList(list.head);
        list.deleteNode(25);
        System.out.println();
        System.out.println("After deleting...");
        list.printList(list.head);

    }
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    private Node deleteNode(int i) {
        if (head.data > i) {
            head = head.next;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            if (curr.data > i) {
                prev.next = curr.next;
                System.out.println("deleted node :"+curr.data);
                curr = next;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }
        return  head;
    }
}
