public class NumericMethod {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String money = "300";
        System.out.println(Integer.max(x,y));
        System.out.println(Integer.valueOf(money));

        Integer a = Integer.valueOf(money);
        int b = Integer.parseInt(money);

        String n = "hello"; // object (instance of class)
        System.out.println(n.charAt(2));

        String name = "William";
        System.out.println(String.format("hello %s", name));

        System.out.println(name.length());
    }
}
