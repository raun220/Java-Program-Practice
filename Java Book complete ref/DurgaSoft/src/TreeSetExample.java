import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet and adding elements to it
        TreeSet<String> treeSet = new TreeSet<String>(Comparator.reverseOrder());
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("date");
        treeSet.add("elderberry");
        //treeSet.add(null);

        // Printing the elements of the TreeSet
        System.out.println("Elements of the TreeSet: " + treeSet);

        // Using the first(), last(), and size() methods
        System.out.println("First element of the TreeSet: " + treeSet.first());
        System.out.println("Last element of the TreeSet: " + treeSet.last());
        System.out.println("Size of the TreeSet: " + treeSet.size());
    }
}
