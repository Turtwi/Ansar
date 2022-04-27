public class Week2 {
    public static void main(String[] args){
        Person person = new Person("Ansar", "Aktobe", "+77055891542","210103367@stu.sdu.edu.kz");
        Student student = new Student("Steff", "USA","4565545654","steff12@gmail.com","freshman");

        System.out.println(person.ToString());
        System.out.println(student.ToString());
    }
}
