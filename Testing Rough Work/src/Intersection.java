import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,4,5};
        int[] arr2 = {4, 4,5,6, 7};
        findIntersection(arr1, arr2);
    }
    public static void findIntersection(int[] arr1, int[] arr2){
        List<Integer> intersection = Arrays.stream(arr1).distinct().filter(i-> Arrays.stream(arr2).anyMatch(j-> j == i)).boxed().toList();
        System.out.println(intersection);
    }
}