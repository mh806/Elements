import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        //benefit for array list -> dynamically resize when add more information
//        ArrayList<Integer> members = new ArrayList<inte>();
//
//        members.add(5);
//        members.get(0);

        //grade is some lists
        List<Integer> grades = new LinkedList<Integer>();
        grades.add(5);
        grades.add(10);
        grades.add(1,7);

        System.out.println(grades.get(0));
        System.out.println(grades.get(1));
        System.out.println(grades.get(2));
        System.out.println(grades.indexOf(7));

        System.out.println(grades.contains(7));
        if (grades.contains(7)){
            System.out.println("congrates!!");
        }

        //clear a list
        grades.clear();

        int[] number = {1,2,5,11};
        //initialise an array by aslist -> add elements
        List<Integer> lists = Arrays.asList(5,1,2,55,123);

        //print array entities by lists
        System.out.println(Arrays.toString(lists.toArray()));

        //for loop and implementation
        for (int i = 0; i<lists.size(); i++){
            lists.set(i, lists.get(i)*2);
            System.out.println(lists.get(i));
        }

        //foreach loop
        for (int list:lists) {
            System.out.println(list);
        }

        //nested foreach loop
        List<List<Integer>> AllGrades = new java.util.ArrayList<List<Integer>>();
        AllGrades.add(Arrays.asList(1,4,1,3,2));
        AllGrades.add(Arrays.asList(123,41,12,32,12));
        AllGrades.add(Arrays.asList(17,42,19,31,22));

        for (List<Integer>codes: AllGrades) {
            for (int code:codes) {
                System.out.print(code+" ");
            }
            System.out.println();
        }

        User me = new User();
        me.setFirstname("William");
        me.setLastname("HUANG");

        User you = new User();
        you.setFirstname("Hello");
        you.setLastname("World");

        List<User>names = new java.util.ArrayList<User>();
        names.add(me);
        names.add(you);
        System.out.println(names.get(1));

        String[] firstName = {"A","B","C","D"};
        String[] lastName = {"g","h","i","j"};

        for(int i=0;i<firstName.length;i++){

            User him = new User();
            him.setFirstname(firstName[i]);
            him.setLastname(lastName[i]);
            names.add(him);
        }

        for (User x:names) {
            System.out.println(x.getFullname());
        }

        ArrayList name = new ArrayList();
        name.printUser(me);


    }

    public void printUser(User user){
        System.out.println(user.getFullname());
    }
}
