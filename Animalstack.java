import java.util.Stack;

public class Animalstack {


    public static void animals() {
        Stack<String> animals = new Stack<>();
        animals.push("HORSE");
        animals.push("Cat");
        animals.push("COW");
        System.out.println("Stack: " + animals);

        String element = animals.peek();
        System.out.println("Top element after peek: " + element);
        String popElement = animals.pop();
        System.out.println("Elements after the pop: " +popElement);
        System.out.println("Stack after pop: " +animals);
    }


    public static void numbers() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(4);
        numbers.push(3);
        System.out.println("Stack: " + numbers);

        int element = numbers.peek();
        System.out.println("ELEMENT AFTER THE PEEK: " + element);

        int poppedElement = numbers.pop();
        System.out.println("ELEMENT AFTER THE POP: " + poppedElement);
        System.out.println("Stack after pop: " + numbers);
    }


    public static void main(String[] args) {
        animals();
        numbers();
    }
}
