import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6, 10, 11),
                Arrays.asList(7, 8, 9)
        );

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hello");
        stringList.add("World");
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("My");
        stringList2.add("Friend!");
        Stream<Integer> intStram = listOfLists.stream().flatMap(Collection::stream);
        intStram.sorted().forEach(System.out::println);
        System.out.println(stringList2);
        System.out.println(stringList);
    }
}
