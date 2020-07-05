public class NestedLoopShapet {
    public static void main(String[] args) {
        for (int i = 0; i<=9; i++){
            for (int k = 9-i; k<=8; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int f = 9;
        while(f>=0){
            int s =f;
            while(s>=0) {
                System.out.print("* ");
                s--;
            }
            System.out.println();
            f--;
        }
    }
}
