import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        System.out.println("Whats your name");
        //Type identifier = new type (); how to create an object
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); //not static -> need to create a new object
        System.out.println("hello "+name);
    }



    //class - contains everything - has members
    //method - do something
    //statement - tell computer to do something
    //properties - store something

    //access modifier - who can use
    //static - no instance is needed
    //object - instance of a class
    //argument - what you pass to method -> used to call an argument
    //parameter - not same with argument -> used to define an argument

    //make argument dynamic
    //enter values

    //variable = store some value
    //expression - evaluate to a value
    //operator -> work on operands +""

    //literals -> values
    //assign literal to a variable

    //javascript -> not have to identify data types
    //primitive types - short boolean int double float byte char
    //objects

    //how to create a variable
    //declare
    //initialise -> x can be changed ->reassigned to variables

    //use final to create constant -> cannot be reassigned

}
