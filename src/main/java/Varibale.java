import java.util.Scanner;

public class Varibale {
    public static void main(String[] args) {
        String string = new String("This is a String");
        System.out.println(string+" :)");
        String easier = "Wow, thats easier!";

        int x =5; //primitive type
        Integer y =5; //object
        System.out.println(x);
        System.out.println(y);

        double z = 20.5;
        boolean isPizzaDelicious = true;
        byte b = 125; //based on ASCII table
        char c = 'C';
        short s = 32767;
        int i = 3421;
        long k = 241541124123458L; //double size of int
        float f = 20.5f; //32
        double d = 20.5; //64 more accuracy

        //float is smaller container than double
        //cast transfer -> lost of information
        float m = (float) (d/i);

        Scanner scanner = new Scanner(System.in);
        String ak = scanner.nextLine();
        System.out.println(ak);

        int p = scanner.nextInt();
        int a = p+x;
        System.out.println(a);

    }

}
