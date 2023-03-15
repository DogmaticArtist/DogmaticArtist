import java.util.Stack;
public class StacksRFun {

    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();

        games.add("CoD");
        games.add("GH");
        games.add("SmB");

        System.out.println(games);

        System.out.println(games.pop());
        System.out.println(games);
        System.out.println(games.peek());

    }
}
