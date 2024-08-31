import java.util.LinkedList;

class Operations {
    public static void insertion(LinkedList<String> languages, String element) {
        languages.add(element);
        System.out.println("After insertion: " + languages);
    }

    public static void deletion(LinkedList<String> languages, String element) {
        if (languages.contains(element)) {
            languages.remove(element);
            System.out.println("After deletion: " + languages);
        } else {
            System.out.println("Element '" + element + "' not found in the list.");
        }
    }

    public static void search(LinkedList<String> languages, String element) {
        if (languages.contains(element)) {
            System.out.println("Element '" + element + "' found at index: " + languages.indexOf(element));
        } else {
            System.out.println("Element '" + element + "' not found in the list.");
        }
    }

    public static void update(LinkedList<String> languages, int index, String newElement) {
        if (index >= 0 && index < languages.size()) {
            languages.set(index, newElement);
            System.out.println("After update: " + languages);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        
        insertion(languages, "JAVA");
        insertion(languages, "Python");
        insertion(languages, "JavaScript");

        deletion(languages, "Python");

        search(languages, "JavaScript");
        search(languages, "Ruby");

        update(languages, 1, "MongoDB");  
        update(languages, 5, "C++"); 
    }
}
