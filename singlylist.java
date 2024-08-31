import java.util.ArrayList;

public class singlylist{
    public static void main(String[] args){
        //create a list
        //create a instance of Arraylist
        ArrayList<String> list = new ArrayList<>();

        //add elements to the list
        list.add("Mahindhra");
        list.add("Benz");
        list.add("Tata");
        list.add("audi");

        //print list
        System.out.println("Initial List:" +list);

        //remove an element from the list
        list.remove("Mahindhra");
        System.out.println("After Removing 'Mahindhra':"+ list);
        
        //get an element from the list
        String cars = list.get(2);
        System.out.println("Element at index 2:"+ cars);

        //update an element in the list
        list.set(0,"Toyoto");
        System.out.println("After updating the index 0:" + list);

        //iterate the over the list
        System.out.println("Iterating over the list:");
        for(String item : list){
            System.out.println(item);
        }
    }
}