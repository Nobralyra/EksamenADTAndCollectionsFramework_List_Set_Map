package example_adt_implementation.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{
    //Empty arraylist
    List<String> smallArrayListExample = new ArrayList<>();


    public void addElements()
    {
        System.out.println("ArrayList: ");
        smallArrayListExample.add("element 1");
        smallArrayListExample.add("element 2");
        smallArrayListExample.add("element 3");
        smallArrayListExample.add("element 4");
    }

    public void getElement()
    {
        String foundElement = smallArrayListExample.get(1);
        System.out.println("What element is found on index 1: " + foundElement);
        int indexOfElement = smallArrayListExample.indexOf("element 1");
        System.out.println("What index has element 1: " + indexOfElement);
    }

    public void removeElement()
    {
        smallArrayListExample.remove(3);
        System.out.println("Removed index 3");
        displayElements();
    }

    public void changeElement()
    {
        String elementChanged = smallArrayListExample.set(2, "element -1");
        System.out.println("Change index 2: " + elementChanged);
        displayElements();
    }

    public void displayElements()
    {
        for(String element : smallArrayListExample) {
            System.out.println(element);
        }
    }



}
