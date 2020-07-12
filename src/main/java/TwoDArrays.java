import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int [] [] arrays1 = new int[3][4]; // 4*3 row and column
        arrays1 [2][3]= 5;

        //twp d arrays
        int [] [] numbers = {
                {1,3,2},
                {5,6,7},
                {7,9,8}
        };

        System.out.println(numbers[1][1]);
        System.out.println(Arrays.deepToString(numbers));
        //need to care when get rid of []

        System.out.println(numbers.length);
        System.out.println(numbers[1].length);

        for (int row = 0; row<numbers.length; row++){
            for(int column = 0; column<numbers[row].length; column++){
                System.out.print(numbers[row][column]+"");
            }
            System.out.println();
        }

    }
}
