import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        //methods to sort your array
        int [] grades = {3,2,1,55,131};
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        Arrays.parallelSort(grades);
        System.out.println(Arrays.toString(grades));

        int [] grades1 = {3,2,1,55,131};
        if (grades==grades1){
            System.out.println("equal");
        }

        if (grades.equals(grades1)){
            System.out.println("equal");
        }
        //two different arrays -> point two different arrays
        if (Arrays.equals(grades,grades1)){
            System.out.println("array equals");
        }

        String [] grades2 = new String [3];
        Arrays.fill(grades2,"");
        System.out.println(Arrays.toString(grades2));
    }
}
