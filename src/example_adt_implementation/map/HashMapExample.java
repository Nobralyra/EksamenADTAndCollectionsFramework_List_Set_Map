package example_adt_implementation.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    Map<Integer, String> smallHashMapExample = new HashMap<>();

    public void addKeyValue()
    {
        System.out.println("HashMap: ");
        smallHashMapExample.put(1,  "A");
        smallHashMapExample.put(2,  "B");
        smallHashMapExample.put(3,  "C");
    }

    public void getValueByKey()
    {
        String valueByKey = smallHashMapExample.get(2);

        System.out.println("The value for key 2 is: " + valueByKey);
    }

    public void replaceEntry()
    {
        smallHashMapExample.replace(3, "D");
        System.out.println("Change value C to D for key 3");
        displayEntries();
    }

    public void containsKeyOrValue()
    {
        boolean doesItContainsKey = smallHashMapExample.containsKey(1);

        System.out.println("Does the key exists for key 1? " + doesItContainsKey);

        boolean doesItContainsValue = smallHashMapExample.containsValue("C");

        System.out.println("Does the value exists for value C? " + doesItContainsValue);
    }

    public void removePairByKey()
    {
        smallHashMapExample.remove(2);
        System.out.println("Removed entry 2");
        displayEntries();
    }

    public void displayEntries()
    {
        for(Map.Entry<Integer, String> entry : smallHashMapExample.entrySet())
        {
            //Integer key = entry.getKey();
            //String value = entry.getValue();
            System.out.println("The key and value is : " + entry);
        }
    }
}
