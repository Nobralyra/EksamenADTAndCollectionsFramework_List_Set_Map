package example_adt_implementation;

import example_adt_implementation.list.ManipulateArrayList;
import example_adt_implementation.map.ManipulateHashMap;
import example_adt_implementation.set.ManipluateTreeSet;

public class Main {

    public static void main(String[] args)
    {
        ManipulateArrayList manipulateArrayList = new ManipulateArrayList();
        //manipulateArrayList.funWithArrayList();
        ManipulateHashMap manipulateHashMap = new ManipulateHashMap();
        //manipulateHashMap.funWithHashMap();
        ManipluateTreeSet manipluateTreeSet = new ManipluateTreeSet();
        manipluateTreeSet.funWithTreeSet();
    }


}
