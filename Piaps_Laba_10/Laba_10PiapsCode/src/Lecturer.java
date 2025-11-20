import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {
    private List<Course> courses;

    public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
        this.courses = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        courses.add(course);
        course.setLecturer(this);
    }

    @Override
    public void work() {
        System.out.println(name + " преподает " + courses.size() + " курсов и проводит исследования");
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Должность: Преподаватель, Курсы: " + courses.size());
        for (Course course : courses) {
            System.out.println("    - " + course.getName() + " (" + course.getWeeklyDuration() + " часов/неделю)");
        }
    }
}