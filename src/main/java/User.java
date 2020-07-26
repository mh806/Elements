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
        return "Hi my name is"+firstname+"."+lastname.toUpperCase();
    }
}
