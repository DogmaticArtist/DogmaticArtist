public class Lamdas {


    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.print();

        printThing(
          () -> {
            System.out.println("Meow!");
        }
        );

    }

    static void printThing(Printable thing){
        thing.print();
    }
}
