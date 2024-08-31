import java.util.Scanner;  
public class Nodelist {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else { 
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;  
        }
    }

    public static void main(String[] args) {
        Nodelist ll = new Nodelist();  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter elements to add to the linked list (negative number to stop):");

        while (true) {
            int data = sc.nextInt();
            if (data < 0) {  
                break;
            }
            ll.insert(data);  
        }

        
        System.out.println("Linked List:");
        ll.printLL();
        sc.close();  
    }
}
