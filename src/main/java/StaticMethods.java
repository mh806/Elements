import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StaticMethods {
    //class -> multiple objects
    public static void main(String[] args) {
        //instance method -> create user and work on objects
           User u = new User();
           u.setFirstname("William");
           u.setLastname("Camby");

           User y = new User();
           y.setFirstname("Camby");
           y.setLastname("William");
        //static -> work on class
        //User.dosth();
        Users.getUser(u);
        
        
        //Overloading -> same method -> different numbers or content of parameters
        //public static test (int x)
        //public static test (String x)
        //test(5) ->pair suitable methods ->involc first one

        System.out.println(u.getFullname(true));
        System.out.println(u.getFullname(false));


        List<User> users = new java.util.ArrayList<User>();
        users.add(u);
        users.add(y);

        System.out.println(User.searchList(users,"William Camby"));
        System.out.println(User.searchList(users,"Camby William"));

        System.out.println(u);

        System.out.println(User.searchList(users, u));

        User search = new User();
        search.setLastname("Not");
        search.setFirstname("Nosss");

        User found = User.findUser(users,search);
        found.setFirstname("Zoey");
        System.out.println(found);

        found.changeSth(search);
        System.out.println(search);

        Student s = new Student();
        s.major = "William Designed";
        System.out.println(s.major);
        //83
    }


}
