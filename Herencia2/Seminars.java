import java.util.ArrayList;

public class Seminars{
    
    ArrayList <CourseInformation> courses = new ArrayList<>();

    public void addMathSeminar(){
        courses.add(new CourseInformation("fundamentales", 5, new Proffesor("Jero", "312", "jero@ucaldas.com")));
        courses.add(new CourseInformation("lineal", 4, new Proffesor("Juan", "3142", "juan@ucaldas.com")));
        courses.add(new CourseInformation("calculo 2", 2, new Proffesor("Pedro", "3133", "pedro@caldas.com")));
        courses.add(new CourseInformation("calculo 1", 3, new Proffesor("Maria", "312323",  "maria@ucaldas.com")));
        courses.add(new CourseInformation("discretas", 5, new Proffesor("Alberto", "31290584", "albertoo@ucaldas.com")));
    }
    public void addProgramationSeminar(){
        courses.add(new CourseInformation("Prog 1", 5, new Proffesor("Jero", "312", "jero@ucaldas.com")));
        courses.add(new CourseInformation("Prog 2", 4, new Proffesor("Juan", "3142", "juan@ucaldas.com")));
        courses.add(new CourseInformation("Soft 2", 2, new Proffesor("Pedro", "3133", "pedro@caldas.com")));
        courses.add(new CourseInformation("Soft 1", 3, new Proffesor("Maria", "312323",  "maria@ucaldas.com")));
        courses.add(new CourseInformation("Prog 3", 5, new Proffesor("Alberto", "31290584", "albertoo@ucaldas.com")));
    }
    public void addPhysicSeminar(){
        courses.add(new CourseInformation("fisica 1", 5, new Proffesor("Jero", "312", "jero@ucaldas.com")));
        courses.add(new CourseInformation("fisica 2", 4, new Proffesor("Juan", "3142", "juan@ucaldas.com")));
        courses.add(new CourseInformation("fisica 3", 2, new Proffesor("Pedro", "3133", "pedro@caldas.com")));
    }
    public ArrayList<CourseInformation> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<CourseInformation> courses) {
        this.courses = courses;
    }
   
   


    


    
}
