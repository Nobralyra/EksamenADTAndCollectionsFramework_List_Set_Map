package example_adt_implementation.map;

public class ManipulateHashMap
{
    public void funWithHashMap()
    {
        HashMapExample hashMapExample = new HashMapExample();

        hashMapExample.addKeyValue();
        hashMapExample.displayEntries();
        hashMapExample.getValueByKey();
        hashMapExample.containsKeyOrValue();
        hashMapExample.replaceEntry();
        hashMapExample.removePairByKey();
    }
}
