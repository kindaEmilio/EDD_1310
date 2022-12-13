import java.util.TreeMap;

public class TreeMap_code {
    public static void main(String[] args) {

        // Creating TreeMap of even numbers
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Three", 3);

        // Using putAll()  inserts all the entries from specified map to this map
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);

        // Using keySet() returns a set of all the keys of a tree map
        System.out.println("Keys: " + numbers.keySet());

        // Using values() returns a set of all the maps of a tree map
        System.out.println("Values: " + numbers.values());

        // Using get() Returns the value associated with the specified key.
        // Returns null if the key is not found.
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault() Returns the value associated with the specified key.
        // Returns the specified default value if the key is not found.
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);


        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value + "\n");

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers + "\n");

        // Using replace()
        System.out.println("Original Treemap" + evenNumbers);
        evenNumbers.replace("Two", 2,  22);
        System.out.println("TreeMap using replace: " + evenNumbers);

    }
}
