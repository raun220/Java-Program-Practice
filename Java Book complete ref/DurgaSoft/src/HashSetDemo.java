import java.util.Iterator;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("grape");
        set.add("watermelon");
        set.add("kiwi");
        //set.add(null);
        //set.add(null);

        // Printing the HashSet
        System.out.println("HashSet: " + set);

        // Removing an element from the HashSet
        set.remove("orange");
        System.out.println("After removing 'orange' element: " + set);

        // Checking if an element exists in the HashSet
        if (set.contains("grape")) {
            System.out.println("The HashSet contains 'grape' element");
        } else {
            System.out.println("The HashSet does not contain 'grape' element");
        }
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            String s = (String) itr.next();
            if(s.equals("banana")){
                itr.remove();
            }
        }
        Iterator itr2 = set.iterator();
        while(itr2.hasNext()){
            String s = (String) itr2.next();
            System.out.println(s);
        }



        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);
    }
}

