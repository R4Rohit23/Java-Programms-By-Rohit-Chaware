package com.company.Tutorials.Set;
import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // Initialization
        Set<Integer> setOfInt = new HashSet<>();

        // Set Methods

        // Adding element
        // The element will be added if it is not present in the set
        setOfInt.add(1);
        setOfInt.add(2);
        setOfInt.add(3);
        setOfInt.add(4);
        setOfInt.add(5);

        // Removing element
        setOfInt.remove(3);

        // clear() => This method is used to remove all the elements from the set but not delete the set.
                   // The reference for the set still exists.

        // contains() => This method is used to check whether a specific element is present in the Set or not.
        System.out.println("Does the set contains '1' : " + setOfInt.contains(1));

        // isEmpty() => This method is used to check whether the set is empty or not
        System.out.println("Does the set is empty ? : " + setOfInt.isEmpty());

        // size() => To get the size of the set
        System.out.println("The size of the set is : " + setOfInt.size());

        // converting it into array
        Object[] arr = setOfInt.toArray();
        System.out.println("The array is:");
        for (Object o : arr) System.out.println(o);

        // array -> set
        String[] vowels = {"a", "e", "i", "o", "u"};

        Set<String> vowelsSet = new HashSet<>(Arrays.asList(vowels));
        System.out.println("Array to set example: " + vowelsSet);
        // asList => it returns the list view of the array

        // we can iterate over the set with the help of for-each loop
        for (Integer integer : setOfInt) {
            System.out.print(integer + " ");
        }

        // Simple print function
        System.out.println("The given set is: " + setOfInt);

    }
}
