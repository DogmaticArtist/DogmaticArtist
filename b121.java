import java.util.Scanner;


public class b121 {

    public static void main(String[] args) {

        int guess, num;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type in a number, and i'll tell you whether it's a prime? ");
        guess = keyboard.nextInt();
        num = guess;

        for ( num = guess -1 ; num > 1 ; num -= 1) {
            if (guess % num == 0) {
                System.out.print("Checking...  " + guess + " is divisible by " + num+ " so it isn't a prime\n");
                break;
            }

            else if (num != 1) {
                System.out.print("You cant divide " + guess + " by " + num + " lets try one down\n");
            }

            
            }

            if (num ==1) {
                System.out.print(guess + " must be a prime!!!!!");
            
            }
        
        
        
    }
}