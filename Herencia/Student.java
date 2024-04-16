public class Student extends Person{
    private String student_id="";

    public Student(String user_name, String lastname, String document, String gender,String student_id) {
        super(user_name, lastname, document, gender);
        this.student_id=student_id;
    }

    @Override
    public String toString() {
        return super.toString()+"id="+this.student_id;
    }

  
}
