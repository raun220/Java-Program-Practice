
import java.util.*;

class Employee{
    String eName;
    int eId;


    Employee(String eName, int eId) {
        this.eName = eName;
        this.eId =  eId;
    }

    public String toString(){
        return eName+" : "+eId;
    }

}

public class Test2 {



    public static void main(String[] args) {
        Employee ob1 = new Employee("Raushan", 109);
        Employee ob2 = new Employee("Aniket", 102);
        Employee ob3 = new Employee("Rau", 100);
        Employee ob4 = new Employee("Ani", 103);
        //SortEmpOnEid ob5 = new SortEmpOnEid(ob1, ob2);

        ArrayList<Employee> al = new ArrayList<>();
        al.add(ob1);
        al.add(ob2);
        al.add(ob3);
        al.add(ob4);
        al.add(new Employee("Rak", 100));
        Collections.sort(al, new MyComparator());
        al.sort(Comparator.comparingInt(e -> e.eId));

       // al.sort(Comparator.comparingInt(ep -> ep.eId, Comparator.reverseOrder()));
        Collections.reverse(al);





        System.out.println(al);
    }
}



class MyComparator implements Comparator{
    public int compare(Object ob1, Object ob2) {
        Employee i1 = (Employee) ob1;
        Employee i2 =  (Employee) ob2;
        int x1=i1.eId;
        int x2= i2.eId;
        if (x1>x2)
            return 1;
        else if (x1<x2)
            return -1;
        else
            return 0;

    }
}





