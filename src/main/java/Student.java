public class Student extends Animals implements Talk{
    public boolean verified = true;
    public String major;

    @Override
    public void sayHello(){
        System.out.println("Hi my major is"+major+" and my name is "+dog+ " and "+cat);
    }

    public Student(){
        System.out.println("Creating a student");
    }

    public Student(String fn,String ln){
        dog = fn;
        cat = ln;
    }

    @Override
    public void gotyou() {
        super.gotyou();
    }

}
