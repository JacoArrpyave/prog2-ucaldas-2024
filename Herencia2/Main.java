public class Main {
    public static void main(String[] args) {
        Student student =new Student("jacobo", "1111-222", "jaco@ucaldas.edu.co", "123", 2);
        Seminars seminars=new Seminars();
        seminars.addMathSeminar();
        seminars.addPhysicSeminar();
        seminars.addProgramationSeminar();
        student.addSeminarStudent(seminars.getCourses());
        student.showCoursesStudent();
        

        
        

        
    }
}
