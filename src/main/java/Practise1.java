import java.util.*;
import java.util.ArrayList;

public class Practise1 {
    public static void main(String[] args) {
        int [] arrays = {1,2,3,4,5};
        for (int array:arrays) {
            System.out.print(array+" ");
        }

        int[][] multi = {
                {1,2,4},
                {3,2,5,1,2}
        };

        for (int[]mul:multi) {
            for (int num:mul){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        List<Integer>AllNumbers = new ArrayList<Integer>();
        AllNumbers.add(1);
        AllNumbers.add(1,2);
        AllNumbers.add(1,222);
        AllNumbers.add(1);
        AllNumbers.add(3);
        for (int i =0;i< AllNumbers.size();i++) {
            System.out.println(AllNumbers.get(i));
        }

        List<List<Integer>> HeapsNumbers = new ArrayList<List<Integer>>();
        HeapsNumbers.add(Arrays.asList(1,2,35,1));
        HeapsNumbers.add(Arrays.asList(11,27,35,11));
        HeapsNumbers.add(Arrays.asList(81,33,35,11,1,511));
        for (List<Integer>Numbers: HeapsNumbers) {
            for (int number:Numbers){
                System.out.print(number+" ");
            }
            System.out.println();
        }

        List<Integer> studentsCollection = Arrays.asList(1,114,124,114,55);
        Collections.sort(studentsCollection);
        Collections.reverse(studentsCollection);
        for (int student:studentsCollection) {
            System.out.print(student+" ");
        }
    }
}
