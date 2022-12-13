import java.util.LinkedHashMap;

public class LinkedHashMap_code {
    public static void main(String[] args) {

        // Creating LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        // Using put()  inserts the specified key/value mapping to the map
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("Original LinkedHashMap: " + evenNumbers);

        // Using putIfAbsent() inserts the specified key/value mapping
        // to the map if the specified key is not present in the map
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        //Creating LinkedHashMap of numbers
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);
        numbers.put("Three", 3);

        // Using putAll() inserts all the entries from the specified map to this map
        numbers.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers);

        // Using entrySet() returns a set of all the key/value mapping of the map
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet() returns a set of all the keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Using values()  returns a set of all the values of the map
        System.out.println("Values: " + numbers.values());

        // Using get() Returns the value associated with the specified
        // key. If the key is not found, it returns null
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault() Returns the value associated with the
        // specified key. If the key is not found, it returns the specified default value.
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);

        // remove method with single parameter
        // returns and removes the entry associated with the specified key from the map
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        // removes the entry from the map only if
        // the specified key mapped to be the specified value and return a boolean value
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated LinkedHashMap: " + numbers);

    }
}
