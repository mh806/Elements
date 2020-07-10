public class NestedLoopShapet {
    public static void main(String[] args) {
        for (int i = 0; i<=9; i++){
            for (int k = 9-i; k<=8; k++){
                System.out.print(k+" ");
            }
            if (i == 2){
                break;
            }
            System.out.println();
        }

        int f = 9;
        while(f>=0){
            int s =f;
            while(s>=0) {
                if(s==5){
                    break;
                }
                System.out.print(s+" ");
                s--;
            }
            System.out.println();
            f--;
        }
    }

    //continue , skip this value
    //break , stop and skip this iteration
}
