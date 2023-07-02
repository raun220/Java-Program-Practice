
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


class Test {
    public static void main( String[] args) {
        String str = "Black Cat";

        str.toLowerCase().chars()
                .mapToObj( c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .forEach(entry->System.out.println(entry.getKey() +" : " + entry.getValue()));
    }

}
