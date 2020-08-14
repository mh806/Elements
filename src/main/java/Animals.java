public abstract class Animals implements Talk{ //prevent instaniate it -> cannot extends
    public String cat;
    public String dog;
    public boolean verified = false;
    private String team;
    private String member;

    public abstract void sayHello();

    //abstract method ->get rid of body and replace like ;
    //achieve it in extends class

    //polymorphism -> something can change to different things depending on how we see them
    //User -> derived class: teacher + student ->

    //constructor -> method to invoke -> no return type -> name to match class
    //initialise value in constructor -> assign value to fields
    //implicit default constructor -> new User()
    //public User(){}

    public void gotyou(){
        System.out.println("I've got it finally");
    }

    //interface
    //2 behaviors to describe -> User -> Teacher
    //interfaces -> define behaviours that class needs to implement - object | characters (describes) | -<
    //walk interface -> class implements -> people, dog and etc

    //class -> extends -> class -> implements (interface)


}
