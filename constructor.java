/**
 * constructor
 */
public class constructor {

    public static void main(String[] args) {

        class PointGeneral {
            double x;
            double y; 
        
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        
            void moveTo(Point remote) {
                this.x = remote.x;
                this.y = remote.y;
            }
        
            
        
        }
        
        Point point = new Point(1,1);
        System.out.println("The point is now at " + point.x + "," + point.y);

        Point remotePoint = new Point(10,20);
        point.moveTo(remotePoint);
        System.out.println("The point is now at " + point.x + "," + point.y); 
        


    }
} 