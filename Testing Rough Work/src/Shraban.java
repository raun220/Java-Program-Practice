import java.util.*;
import java.util.Map.Entry;

public class Shraban {
    public static void main(String[] args) {
        //int[] arr = {3, 2, 1, 2, 4, 3, 1, 2, 4, 0};
        List<Integer> lis = Arrays.asList(3, 2, 1, 2, 4, 3, 1, 2, 4, 0);
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer a : lis ){
            map.put(a, map.getOrDefault(a,0)+1);
        }

        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) ->
            o2.getValue() - o1.getValue()
         );
        for(Entry<Integer, Integer> list2 : list){
            for(int i=0; i<list2.getValue(); i++){
                System.out.print(list2.getKey()+" ");
            }
        }
    }


}
