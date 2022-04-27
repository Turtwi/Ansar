public class Stuff extends Employee {
    private String title;

    public Stuff(String name, String address, String phonenumber, String email, String title){
        super(name, address, phonenumber, email);
        this.title = title;
    }

    @Override
    public String ToString(){
        return "Stuff " + super.getName() + " " +this.title;
    }
}
