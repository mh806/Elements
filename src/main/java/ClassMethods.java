public class ClassMethods {
    public static void main(String[] args) {

        String favFood; //field

        Users users = new Users(); // declare and initialise a Users
        users.name = "William Huang"; // set properties to values
        users.firstName = "World";
        users.lastName = "Hello";
        System.out.println(users.getFullName());

        //primitive and objects
        int x = 5; // fine to compare ==
        String z = new String("memory location"); //object compare memory location

        //to avoid interning -> caching -> memory point to same location -> use equal instead
    }

}
