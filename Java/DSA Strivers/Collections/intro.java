import java.util.*;
/**
 * Introduction to Collections in Java
 *
 * The Java Collections Framework provides a set of classes and interfaces
 * for storing and manipulating groups of data as a single unit, called a collection.
 * Collections are used to represent and manage data such as lists, sets, and maps.
 *
 * Common interfaces:
 * - List: Ordered collection (e.g., ArrayList, LinkedList)
 * - Set: Unordered collection with no duplicates (e.g., HashSet, TreeSet)
 * - Map: Key-value pairs (e.g., HashMap, TreeMap)
 *
 * Benefits:
 * - Reusable data structures
 * - Algorithms for searching, sorting, and modifying data
 * - Thread-safe variants available
 *
 * Example usage:
 */


public class intro {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, will not be added
        System.out.println("Set: " + set);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Map: " + map);
    }
}