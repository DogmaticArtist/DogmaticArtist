import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main ( String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Jerry");
        names.add("Abdul");
        names.add("joseph");
        names.add("Han");
        names.add("Han");

        System.out.println(names);
    }
}
