public class StaticMethods {
    //class -> multiple objects
    public static void main(String[] args) {
        //instance method -> create user and work on objects
           User u = new User();
           u.setLastname("William");
           u.setFirstname("Camby");
        //static -> work on class
        //User.dosth();
        Users.getUser(u);
        //71
    }

}
