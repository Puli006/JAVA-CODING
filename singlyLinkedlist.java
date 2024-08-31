public class singlyLinkedlist {
    Node head; // head of the list

    // method to insert a new node at the end
    public void append(int new_data) {
        Node new_node = new Node(new_data);

        // if the list is empty, make the new node the head
        if (head == null) {
            head = new_node;
            return;
        }

        // otherwise, traverse to the end and add the new node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        
    }

    // method to insert a new node at the front
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // method to insert a new node after the given node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // method to delete a node with the given key
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // if the head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // change head
            return;
        }

        // search for the key to be deleted, keep track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // if the key was not present in the list
        if (temp == null) return;

        // unlink the node from the linked list
        prev.next = temp.next;
    }

    // method to print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }
}
