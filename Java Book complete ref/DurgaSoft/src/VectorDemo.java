import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Object> al = new Vector<>();
        String str = "RaushanRau";

        System.out.println(al.size());
        System.out.println(al.capacity());

        for(int i=0; i<str.length(); i++) {
             String c = str.charAt(i)+"";
             al.addElement(c);
            // al.addFirst(c);
            //al.addFirst(str.charAt(i)+"");
        }
        System.out.println(al.size());
        System.out.println(al.capacity());
        for(Object op: al) {
            System.out.print(op);
            // System.out.println(al.indexOf(op));
            // System.out.println(al.get(j));
            //j++;
        }
    }
}
