public class Person {
    private String name;
    private String address;
    private String phonenumber;
    private String email;

    public Person(String name, String address, String phonenumber, String email){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String ToString(){
        return "Person " + this.getName();
    }

    public String getName(){
        return this.name;
    }
}
