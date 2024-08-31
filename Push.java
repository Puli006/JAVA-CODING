public class Push {
    private int maxSize;
    private int[] stackArray;
    private int top;

   
    public Push(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

   
    public boolean isEmpty() {
        return (top == -1);
    }

    
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push: " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        }
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek. Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        Push myStack = new Push(5); 
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

       
        int topElement = myStack.peek();
        System.out.println("Top element after peek: " + topElement);

        
        int popElement = myStack.pop();
        System.out.println("Popped element: " + popElement);

        
        topElement = myStack.peek();
        System.out.println("Top element after another peek: " + topElement);

        
        myStack.pop();
        myStack.pop();

       
        myStack.pop();
    }
}
