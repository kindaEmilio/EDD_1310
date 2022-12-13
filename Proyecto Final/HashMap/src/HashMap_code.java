import java.util.Map.Entry;
import java.util.HashMap;

public class HashMap_code {
        public static void main(String[] args) {

            // create a hashmap
            HashMap<String, Integer> numbers = new HashMap<>(); // hashMap creation with 8 capacity and 0.6 load factor
            System.out.println("Initial HashMap: " + numbers);

            // put() method to add elements
            numbers.put("One", 1);
            numbers.put("Two", 2);
            numbers.put("Three", 3);
            System.out.println("HashMap after put(): " + numbers);

            //get() method to get value
            Integer value = numbers.get("Two");
            System.out.println("Value at index two: " + value);

            // return set view of keys using keySet()
            System.out.println("Keys: " + numbers.keySet());

            // return set view of values using values()
            System.out.println("Values: " + numbers.values());

            // return set view of key/value pairs using entrySet()
            System.out.println("Key/Value mappings: " + numbers.entrySet());

            // change element with key 2
            numbers.replace("Three", 4);
            System.out.println("HashMap using replace(): " + numbers + "\n");


            // remove element associated with key 2
            int erase = numbers.remove("Three");
            System.out.println("Removed value: " + erase);
            System.out.println("Updated HashMap: " + numbers + "\n");


            // iterate through keys only
            System.out.print("Keys: ");
            for (String key : numbers.keySet()) {
                System.out.print(key);
                System.out.print(", ");
            }

            // iterate through values only
            System.out.print("\nValues: ");
            for (int value1 : numbers.values()) {
                System.out.print(value1);
                System.out.print(", ");
            }

            // iterate through key/value entries
            System.out.print("\nEntries: ");
            for (Entry<String, Integer> entry : numbers.entrySet()) {
                System.out.print(entry);
                System.out.print(", ");

            }
        }
}
