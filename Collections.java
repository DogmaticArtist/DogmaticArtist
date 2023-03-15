import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main( String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jerry");
        names.add("John");
        names.add("Abdul");
        names.add("Hamza");
        names.add("Chen");
        names.add(0, "Joseph");

        System.out.println(names);

    }


}
