public class User {
    //fields
    private String firstname;
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
        return firstname.toUpperCase();
    }

    //setter
    public void setFirstname(String fn){
        firstname = fn.strip();
    }

    public void setLastname(String ln){
        lastname = ln.strip();
    }

    public String getFullname(){
        return getFirstname()+" "+lastname;
    }
}
