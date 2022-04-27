import java.util.Date;

public class Employee extends Person {
    private String office;
    private int salary;
    private Date dateHired;

    public Employee(String name, String address, String phonenumber, String email, String office, int salary, Date dateHired){
        super(name, address, phonenumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phonenumber, String email) {
        super(name, address, phonenumber, email);
    }


    @Override
    public String ToString(){
        return "Empliyee " + super.getName() + " " + this.salary;
    }

}
