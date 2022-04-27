public class Student extends  Person{
    final private String status;

    public Student(String name, String address, String phonenumber, String email, String status){
        super(name, address, phonenumber, email);
        this.status = status;
    }

    @Override
    public String ToString(){
        return "Student " + super.getName() + " " + this.status;
    }
}
