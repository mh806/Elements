public class Student extends Animals {
    public boolean verified = true;
    public String major;

    @Override
    public void sayHello(){
        System.out.println("Hi my major is"+major+" and my name is "+dog+ " and "+cat);
    }
}
