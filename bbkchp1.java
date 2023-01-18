/**
 * bbkchp1
 */
public class bbkchp1 {

    public static void main(String[] args) {
       
        int maxi = 0;
        String word = ".";
        
        System.out.println("Given a series of words, each on a seperate line,");
        System.out.println("this program finds the length of the longest word");
        System.out.println("Please enter several sentences, one per line");
        System.out.println("Finish with a black line");

        

        while (word.length() > 0) {
            word= System.console().readLine();
            if (word.length() > maxi) {
                maxi = word.length();
            }
        }
        if (maxi == 0) {
            System.out.println("There were no words.");
        } else {
            System.out.println("The longest sentence was " + maxi + "characters long.");
        }
    }
}