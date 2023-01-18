public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"Toyota", "Honda", "Chevrolet", "Chrysler" };
        //System.out.print(cars[3]);
        //cars[3] = "Tesla";
        //System.out.println(cars[3]);

        for (int i=0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }

        for (int i= cars.length -1; i >= 0; i--) {
            System.out.println("\t\n" + cars[i]);
        }

        for (String car : cars) {
            System.out.println("\t\n"+car);

        }
        
    }
}