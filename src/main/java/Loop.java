import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /* icu
        initialise ->iteration for each loop
        comparison
        update

         */

        //do-while loop -> at least execute once
        //while loop ->
        String psw = "Let me in";
        boolean addtionalLogging = true;
        Scanner scanner = new Scanner(System.in);
        String guess;
        do {
            System.out.println("Guess the password");
            guess = scanner.nextLine();
        } while (!guess.equals(psw));{
            System.out.println("Congrats");
        }

        for (int i = 0; i<5; i++){
            System.out.println("Now you are in line "+i);
            if (i == 3){
                if (addtionalLogging == true) {
                    System.out.println("We have found " + i);
                }
            }
            if (i ==4){
                for (int k = 9; k>= 0; k --){
                    System.out.println(k+ " ");
                }

            }
        }


    }
}
