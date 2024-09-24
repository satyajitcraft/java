

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.addFirst("Mango"); // Adding at the first position
        fruits.addLast("Orange"); // Adding at the last position

        // Displaying the LinkedList
        System.out.println("Initial LinkedList: " + fruits);

        // Accessing elements
        System.out.println("First Element: " + fruits.getFirst());
        System.out.println("Last Element: " + fruits.getLast());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Removing elements
        fruits.removeFirst(); // Removing the first element
        fruits.removeLast();  // Removing the last element
        fruits.remove(1);     // Removing the element at index 1

        // Displaying the LinkedList after removals
        System.out.println("LinkedList after removals: " + fruits);

        // Checking if LinkedList contains an element
        if (fruits.contains("Apple")) {
            System.out.println("The list contains Apple");
        } else {
            System.out.println("The list does not contain Apple");
        }

        // Adding more elements
        fruits.add("Grapes");
        fruits.add("Pineapple");

        // Displaying the LinkedList after adding more elements
        System.out.println("LinkedList after adding more elements: " + fruits);

        // Clearing the LinkedList
        fruits.clear();

        // Checking if the LinkedList is empty
        if (fruits.isEmpty()) {
            System.out.println("The LinkedList is now empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }
    }
}

