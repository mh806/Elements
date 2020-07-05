import java.util.Scanner;

public class ComplicatedString {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("Cats or Dogs");
        String animal = scanner.nextLine();

        //binary operator
        String name = "William";
        boolean really = name.equals("Billy") ? true: false;

        //only one statement will be allowed in if statements

    }
}
