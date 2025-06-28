package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Let's use the Question to understand Hashmap use and imp methods
        // Q: Create a  HashMap using Java HashMap and store person's (name,age)
        Map<String,Integer> persons = new HashMap<>();

        //1. Method to add element
        persons.put("Akash",21);
        persons.put("Rashi", 31);
        persons.put("Saurabh", 31);
        persons.put("Surabhi", 31);

        //2. Get Value of the Key of hashmap
        System.out.println("Age of key Rashi which exists is::  " + persons.get("Rashi"));
        // If the Key exists returns the Value so O/P = 31
        // If the Key does not exists then O/P = null
        System.out.println("Age of key Pranav and key pranav does not exists:: " + persons.get("pranav"));

        //3. Updating Or Changing the Value of the key
        // We use the Same "put" method to add/update
        //Behaviour: if key exists => updates else add the key and value
        persons.put("Surabhi", 30);
        System.out.println("The value of Key Surabhi which already exists and has value 31  " +
                "after again using put with value 30::" + persons.get("Surabhi"));

        //4. Remove the Pair from the hashmap: Returns value for corresponding key if key exist else return null
        System.out.println("remove the pair with key Akash that exists returns value :: " + persons.remove("Akash"));
        System.out.println("remove the pair with key Akash that removed and now not exists return :: " + persons.remove("Akash"));

        //5. Check if key exists
        System.out.println("Check if key Akash exists which we removed and hence not exists:: " + persons.containsKey("Akash"));
        System.out.println("Check if key Rashi exists which do exists:: " + persons.containsKey("Rashi"));

        //6. Add new entry if the key does not exist
        // a. Use above containsKey Method and out method
        if(!persons.containsKey("Akash")){ persons.put("Akash",67); }
        System.out.println("Akash added which we removed before and value for key is :: " + persons.get("Akash") );

        //b. Use Method
        persons.putIfAbsent("Akash", 56);
        System.out.println("Adding Akash if not existed but since we added this wont complete:: " + persons.get("Akash") );

        //7. Get All keys in the HashMap
        System.out.println("All keys are :: " + persons.keySet());

        //8. Get All the Values
        System.out.println("All the Values are :: " + persons.values());

        //9. Get All the Keys and Values
        System.out.println("All the Mappings are :: " + persons.entrySet());

        //10. Traverse
        //a. We can traverse using the entry
        System.out.println("Traverse using the Key");
        for (String key: persons.keySet()){
            System.out.println("Age of " + key + " is " + persons.get(key));
        }

        System.out.println("Traverse using the entry");
        //b. We can traverse using the Entryset
        for (Map.Entry<String,Integer> entry : persons.entrySet()){
            // we could have used "var" instead of specifying the complete Type
            System.out.println("Age of " + entry.getKey() + " is " + entry.getValue());
        }


    }



}
