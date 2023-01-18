import java.util.Scanner;/**
 * a1
 */
public class a1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int a,b,c;
        System.out.print("Type in three integers and I will order them,\nsmallest to largest ");


        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        

        if (a < b) {
            
            if (b < c) {
                
                System.out.print("So the order is " + a + " " + b + " " + c);
            }

            else {
                
                if ( a < c) {
                    System.out.print("so the order is " + a + " " + c + " " + b);
                }       
                
                else {
                    System.out.print("so the order is " + c + " " + a + " " + b);
                     }
                }

            }

        else {
               if (b < c) {
                   if (c < a) {
                       System.out.print("so the order is " + b + " "+ c + " " + a);
                   }
                   else {
                       System.out.print("so the order is " + b + " " + a + " " + c);
                   }
                }
                
                else {
                   System.out.print("the order is" + " " + c + " " +b + " " + a );
               }

        
            }

        }
    }
        

        
        
   