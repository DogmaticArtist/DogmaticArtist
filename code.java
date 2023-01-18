/**
 * code
 */
public class code {

    public static void main(String[] args) {
        class Person {
            String name, father, mother;
            int age;
        }

        Person employee = new Person();
        employee.name = "John String";
        employee.age = 45;
        System.out.println("BOSS: How old are you, " + employee.name + "?");
        System.out.println("EMPLOYEE: I am " + employee.age + " years old. ");


        Person john = new Person();
        john.name = "John Smith";
        john.age = 35;

        Person mary = new Person();
        mary.name = "Mary Smith";
        mary.age = 32;

        Person student = new Person();
        student.name = "John Smith Jr";
        student.age = 5;
        student.father = john.name;
        student.mother = mary.name;

        System.out.println("TEACHER: How old are you " + student.name);
        System.out.println("LITTLE JOHN: I am " + student.age + " years old, Sir");
        System.out.println("Teacher: What is the full name of your mother, " + student.mother);
        System.out.println("My mother's full name is " + student.mother + ", Sir");

    }
}