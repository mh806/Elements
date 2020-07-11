import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] sss = new int[10]; //declare an array
        sss[0] = 10;
        System.out.println(sss[0]);

        //another formats
        int[] array = {1,2,3,4,5};
        System.out.println(array[2]);
        for(int i=0;i<array.length;i++){
            System.out.println("Line "+(i+1) +": "+array[i]);
        }

        //upgrade
        sss[0]= 299;
        System.out.println(sss[0]);
        System.out.println(Arrays.toString(sss));
        //to string print array out

        //deep to string
        int [] [] grades={{2,3,1},{3,2,1}};
        System.out.println(Arrays.deepToString(grades));

        //how to dynamically create arrays with size
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arrays = new int[size];

        for(int i=0;i<size;i++){
            int z = scanner.nextInt();
            arrays[i] = z;
            if (arrays[i]==88){
                System.out.println("founded!!");
            }
        }
        System.out.println(Arrays.toString(arrays));
    }

}
