public class CourseInformation {
    private String course_name="";
    private int week_hours=0;
    private Proffesor proffesor_info;

    public CourseInformation(String course_name, int week_hours, Proffesor proffesor_info) {
        this.course_name = course_name;
        this.week_hours = week_hours;
        this.proffesor_info = proffesor_info;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getWeek_hours() {
        return week_hours;
    }

    public void setWeek_hours(int week_hours) {
        this.week_hours = week_hours;
    }

    public Proffesor getProffesor_info() {
        return proffesor_info;
    }

    public void setProffesor_info(Proffesor proffesor_info) {
        this.proffesor_info = proffesor_info;
    }

    @Override
    public String toString() {
        return "course_name=" + course_name + ", week_hours=" + week_hours + ", proffesor_info="
                + proffesor_info ;
    }
}
