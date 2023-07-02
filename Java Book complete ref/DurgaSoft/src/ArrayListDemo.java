
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList<String> al = new ArrayList<>();
        LinkedList<String> al = new LinkedList<>();
       // System.out.println(al.size());
        String str = "Raushan";
       // al.add("10");
        //al.add("A");
        //al.add(null);
        //al.add(null);
      //  System.out.println(al.size());
      //  System.out.println(al);
       // System.out.println(al.remove(1));
        //int j= al.size();
       // System.out.println(al.size());
        for(int i=0; i<str.length(); i++) {
           // String c = str.charAt(i)+"";
           // al.add(c);
           // al.addFirst(c);
            al.addFirst(str.charAt(i)+"");
        }
        for(String op: al) {
            System.out.print(op);
           // System.out.println(al.indexOf(op));
           // System.out.println(al.get(j));
            //j++;
        }
        System.out.println();
        for(int j=0; j<str.length(); j++) {
            System.out.print(al.get(j));
        }


    }
}
