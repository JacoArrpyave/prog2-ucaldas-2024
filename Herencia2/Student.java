import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    Scanner scn=new Scanner (System.in);
    private String student_number;
    private float average_mark;
    ArrayList<CourseInformation> seminars_student=new ArrayList<>();

    public Student(String name, String phone_number, String email, String student_number, float average_mark) {
        super(name, phone_number, email);
        this.student_number = student_number;
        this.average_mark = average_mark;

    }

    public String isEligibleToEnrool() {
        return super.name + this.student_number + this.average_mark;

    }

    public void getSeminarsTaken() {

    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public float getAverage_mark() {
        return average_mark;
    }

    public void setAverage_mark(float average_mark) {
        this.average_mark = average_mark;
    }
    public void addSeminarStudent(ArrayList<CourseInformation> courses){
        for (CourseInformation courseInformations : courses) {
            System.out.println(courseInformations);
            
        }
        System.out.println("Ingrese el nombre del seminario que desea agregar");
        String nombre=scn.nextLine();
        for (CourseInformation courseInformations : courses) {
            if (courseInformations.getCourse_name().equals(nombre)) {
                this.seminars_student.add(courseInformations);
                break;
            }
            
        }

    }
    public void showCoursesStudent(){
        for (CourseInformation courseInformations : seminars_student) {
            System.out.println(courseInformations);
            
        }
    }
}
