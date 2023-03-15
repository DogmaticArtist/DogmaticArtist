import java.util.LinkedList;
import java.util.Queue;

public class BBQueue {

    public static void main( String[] args ) {

        Queue<String> bbqLine = new LinkedList<>();

        bbqLine.add("jackson");
        bbqLine.add("Tyrone");
        bbqLine.add("Susan");

        bbqLine.poll(); // taken jackson out of line
        bbqLine.poll(); // takes Tyrone
        System.out.println( bbqLine.peek() ); // tells you who is in line

    }
}
