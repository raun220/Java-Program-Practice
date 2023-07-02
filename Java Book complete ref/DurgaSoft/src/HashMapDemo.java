import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        IdentityHashMap<Character, Integer> hm = new IdentityHashMap<>();
        String str = " Black cat";
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c != ' '){
                if(hm.containsKey(c)){
                    int count = hm.get(c);
                    hm.put(c, count+1);
                }
                else{
                    hm.put(c, 1);
                }
            }
        }
        Set s= hm.entrySet();
        System.out.println(s);
        System.out.println(hm);

        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Character,Integer> e = itr.next();
            System.out.println("'"+e.getKey()+"' occur "+e.getValue()+" times");
        }

        HashMap hm2 = new HashMap();
        //Hashtable hm2 = new Hashtable();
        //IdentityHashMap hm2 = new IdentityHashMap();
        hm2.put(1, 1);
        hm2.put(2, 1);
        System.out.println(hm2);
        hm2.put(1, 16);
        hm2.put(0, 1);
        System.out.println(hm2);

        //HashMap hm2 = new HashMap();
        //Hashtable hm2 = new Hashtable();
        IdentityHashMap hm3 = new IdentityHashMap();
        hm3.put(1, "A");
        hm3.put(2, "b");
        System.out.println(hm3);
        hm3.put(1, "C");
        hm3.put(0, "D");
        System.out.println(hm3);
        System.out.println(hm3.size());

        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        Integer key1 = new Integer(1);
        Integer key2 = new Integer(1);
        map.put(key1, "value1");
        map.put(key2, "value2");
        System.out.println(map.size()); // prints 2
        System.out.println(map);


    }
}
