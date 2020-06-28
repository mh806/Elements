import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String x = "good luck have a good luck day";

        System.out.println(x.charAt(5));
        System.out.println(x.contains("luc"));
        System.out.println(x.indexOf("od"));

        System.out.println(x.indexOf("luck",x.indexOf("luck"))+2);
        System.out.println(x.lastIndexOf("luck"));

        String y = " \t\nhello world";
        System.out.println(y.strip()); //used for password enter
        System.out.println(y.substring(6,11));
        System.out.println(y.repeat(2));

        System.out.println(y.equals("hell0"));

        String password = "let me in";

        System.out.println("Guess the password");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(password.equals(guess));

        

    }
}
