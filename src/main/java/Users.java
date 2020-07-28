public class Users {

    //members - methods and properties

    public String name;
    public String firstName;
    public String lastName;

    public String getFullName(){
        return firstName+" "+lastName;
    }

    //static method
    public static void getUser(User user){
        System.out.println(user.getFullname());
    }
}
