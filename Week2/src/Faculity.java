
public class Faculity extends Employee {
    private String officeHours;
    private String rank;

    public Faculity(String name, String address, String phonenumber, String email,String officeHours, String rank){
        super(name, address, phonenumber, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String ToString(){
        return "Faculiry " + super.getName() + " " + this.rank;
    }
}
