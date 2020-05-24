package example_adt_implementation.set;

import java.util.TreeSet;

public class TreeSetExample
{
    /**
     * Can not refrere to interface Set, because it have no order, and I want to use the methods higher and lower, from TreeSet
     */
    TreeSet<String> smallTreeSetExample = new TreeSet<>();

    public void addElements()
    {
        System.out.println("TreeSet: ");
        smallTreeSetExample.add("A");
        smallTreeSetExample.add("B");
        smallTreeSetExample.add("C");
        smallTreeSetExample.add("D");
        smallTreeSetExample.add("E");
    }

    public void duplicateElement()
    {
        System.out.println("Try to insert element D that already exists");
        smallTreeSetExample.add("D");
        displayElementsFromTreeSet();
    }

    public void elementLowerAndHigher()
    {
        System.out.println("Element greater than "  + "B" + " : " + smallTreeSetExample.higher("B"));
        System.out.println("Element lower than "  + "B" + " : " + smallTreeSetExample.lower("B"));
    }

    public void removeElementFromTreeSet()
    {
        smallTreeSetExample.remove("C");
        System.out.println("Removed element C");
        displayElementsFromTreeSet();
    }

    public void displayElementsFromTreeSet()
    {
        for(String element : smallTreeSetExample) {
            System.out.println(element);
        }
    }
}
