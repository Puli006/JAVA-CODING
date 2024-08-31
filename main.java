public class main {
    public static void main(String[] args) {
        singlyLinkedlist list = new singlyLinkedlist();

        // insert elements into the list
        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        list.insertAfter(list.head.next, 8);

        System.out.println("Created Linked list is:");
        list.printList(); // corrected method name

        list.deleteNode(8); // delete node with data 8
        System.out.println("\nLinked list after Deletion of 8:");
        list.printList(); // corrected method name
    }
}
