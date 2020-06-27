public class NumbericData {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NaN);
        Math.sqrt(-1);

        double x = 5.0 / 2;
        double y = (double) 5/2;
        x++; // changes operator values -> increment operator
        y--;
        System.out.println(x);
        System.out.println(y);

        double a = x++;
        System.out.println(x);
        System.out.println(a);

        double z = --y;
        System.out.println(y);
        System.out.println(z);
    }
}
