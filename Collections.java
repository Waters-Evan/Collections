package Collections;
import java.util.*;



public class CollectionsDemo {
    public static void main(String[] args) {


/*The Java collections framework (JCF) is a set of classes and interfaces that implement 
*commonly reusable collection data structures. Although referred to as a framework, it works 
*in a manner of a library. The JCF provides both interfaces that define various collections 
*and classes that implement them. (Wikipedia)
*/



/*  There are a lot of different types of collections. I’m going to be focusing on the list 
*interface, the set, and the map. 
*The List interface - This extends Collection and an instance of List stores an ordered collection of elements.
*The Set - This extends Collection to handle sets, which must contain unique elements
*The Map - This maps unique keys to values.
*/






/*Array Lists
*List Interface - Extends collection and declares the behavior
* of a collection that stores a sequence of elements
*• Elements can be inserted or accessed by their position in the list, using a zero-based index.
*• In addition to the methods defined by Collection, List defines some of its own, which are 
*  summarized in the following below Table.
*• Several of the list methods will throw an UnsupportedOperationException if the collection cannot be modified, and a 
*  ClassCastException is generated when one object is incompatible with another.
*/
        

        //Working Example of an Array List
        
        
        //add method can add integers, strings, and even null values to the list
        List numbers = new ArrayList();
        numbers.add(21);
        numbers.add(15);
        numbers.add(null);
        numbers.add(24);
        numbers.add("sixty seven");
        numbers.add(69);

        //get method can return a piece of data from the specified spot in the index.
        System.out.println();
        System.out.println(" Numbers");
        System.out.print("\t" + numbers);
        System.out.println();
        System.out.println("The first integer in numbers is: " + numbers.get(0));
        System.out.println();
        System.out.println("The second integer in numbers is: " + numbers.get(1));


        //Remove method can remove values at a specific index.
        System.out.println();
        numbers.remove(2);
        // Removing a null value
        System.out.println();
        System.out.println("");
        numbers.remove(0);
        System.out.println(numbers);


        // Removing a negative index
        try {
            System.out.println(numbers.remove(-1));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Got an IndexOutOfBounds Exception.");
        }

        // Calling Out of the Index
        System.out.println();
        System.out.println("There's nothing after index 5.");
        try {
            System.out.println(numbers.get(6));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Got an IndexOutOfBounds Exception.");
        }

        // Null value in the array list
        System.out.println();
        System.out.println("Adding a null value into the array");
        numbers.add(2, null);
        System.out.println(numbers);

        

        


/*
* Set-Collection that cannot contain duplicate elements.
* It models the mathematical set abstraction
*/
        System.out.println();
        HashSet aHashSet = new HashSet();
        aHashSet.add("Big Mac");
        aHashSet.add("McDouble");
        System.out.println(aHashSet);

        // Add a duplicate element
        System.out.println("Adding a duplicate element");
        aHashSet.add("McDouble");
        System.out.println(aHashSet);
        System.out.println("The extra element was not added.");


        aHashSet.remove("Wopper");
        System.out.println(aHashSet);

        aHashSet.remove("Big Mac");
        System.out.println(aHashSet);








        //adding integers using a for loop
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println();
            System.out.println("Adding integers using a for loop");
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<Integer>(set);

            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is: " +
                    (Integer) sortedSet.first());
            System.out.println("The last element of the set is: " +
                    (Integer) sortedSet.last());
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }





/*Maps - Maps unique keys to values.
* A key is an object that you use to
* retrieve a value at a later date.
*/


        //Hash Map
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", 14);
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
        System.out.println();



        //TreeMap
        TreeMap<String, String> aTreeMap = new TreeMap<String, String>();
        aTreeMap.put("Key 1", "Grape");
        aTreeMap.put("Key 2", "Apple");
        System.out.println("Key 1 is "+aTreeMap.get("Key 1"));
        System.out.println("Key 2 is "+aTreeMap.get("Key 2"));

        // Print something that doesn't exit
        System.out.println("Print Key 3 (doesn't exist)");
        System.out.println("Key 3 is "+aTreeMap.get("Key 3"));

        // Try to duplicate a key
        aTreeMap.put("Key 1", "Tomato");
        System.out.println("Key 1 is now "+aTreeMap.get("Key 1"));




        // Null key?
        try {
            aTreeMap.put(null, "Null Key");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Can't have a null key in a map.");
        }

    }

}



