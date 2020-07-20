public class OOP {
    //why OOP -> type exact what happened

    //object -> structure to represent sth -> 100 users dont create -> programmatically
    //blueprint(class)| -> instantiate -> object(William/Peter/Charles) | variables

    //fields -> variable in class


    public String talk(String name){
        return "I am "+name;
    }

    public static void main(String[] args) {
        User user = new User(); //constructor -> local variable
        user.firstname = "William";
        user.lastname = "Huang";

        user.output();
    }
    //class
}
