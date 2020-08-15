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

        //virtual -> derived class
        //private static method cannot use virtual -> exception -> most time default virtual implicitly
        //Override code examples

        Student sss = new Student();
        sss.major=" William Huang";
        sss.dog = "sss";
        sss.cat = "william";
        sss.sayHello();

        Teacher mmm = new Teacher();
        mmm.cat = "Teach";
        mmm.dog = "Er";

        List<Animals> animals = new ArrayList<>();
        animals.add(sss);
        animals.add(mmm);

        for (Animals animal:animals){
            animal.sayHello();
        }

        Student z = new Student("mark","hallo");
        System.out.println(z.cat);

        Student l = new Student();
        l.gotyou();

        Student p = new Student();

        List<Talk> thingsTalk = new ArrayList<>();
        thingsTalk.add(s);


    }


}
