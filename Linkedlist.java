import java.util.LinkedList;  

class LinkledList {  
    public static void li() {
        LinkedList<String> languages = new LinkedList<>();  
        languages.add("Java");  
        languages.add("Python");
        languages.add("JavaScript");  
        languages.add("Java");
        System.out.println("LinkedList: " + languages);
        languages.set(3, "MongoDB");  // 
        System.out.println("Updated LinkedList: " + languages);
    }

    public static void main(String[] args) {
        li();  
    }
}
