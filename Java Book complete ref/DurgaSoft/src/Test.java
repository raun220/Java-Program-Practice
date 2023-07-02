import java.util.*;
public class Test {
    public static void main(String[] args) {

        HashMap map = new HashMap<>();
        map.put(10,"abc");
        map.put(20, "abcde");

        Set entrySet = map.entrySet();

        Set keySet = map.keySet();

        Collection values = map.values();

        System.out.println("Entry Set:");
        for(Object o : entrySet) {
            System.out.println(o);
        }

        System.out.println("Key Set:");
        for(Object o : keySet) {
            System.out.println(o);
        }

        System.out.println("Values:");
        for(Object o : values) {
            System.out.println(o);
        }

    }

}
