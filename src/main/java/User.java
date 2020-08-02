import java.util.List;

public class User {
    //fields
    public String firstname;
    public String lastname;

    public void output(int times){
        for(int i = 0; i<times; i++){
            System.out.println(firstname + " " + lastname + " ");
        }
    }

    public String returnValue(){
        return "Hi my name is "+firstname+"."+lastname.toUpperCase();
    }

    //encapsulation
    //getter
    public String getFirstname(){
        return firstname;
    }

    //setter
    public void setFirstname(String fn){
        firstname= fn;
    }

    public void setLastname(String ln){
        lastname = ln;
    }

    //overloading -> make different method for different parameters
    public String getFullname(){
        return getFirstname()+" "+lastname;
    }
    public String getFullname(Boolean nice){
        if (nice){
            return "smart guy!!! "+getFullname();
        } else {
            return "you are not so nice. " + getFullname();
        }
    }

    public static void printUsers (List<User> users){
        for (User u : users){
            System.out.println(u.getFullname());
        }
    }

    public static int searchList (List<User> users, String fn, String ln){
        return searchList(users, fn+" "+ ln);
    }

    public static int searchList (List<User> users, String fullName){
        for(int i =0; i<users.size(); i++){
            if (users.get(i).getFullname().equals(fullName)){
                return i;
            }
        }
        return -1;
    }

    public static int searchList(List<User>users, User u){
        return searchList(users, u.getFullname());
    }
    //override -> derived class: different methods

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    //79
}
