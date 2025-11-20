public class Course {
    private int id;
    private String name;
    private float weeklyDuration;
    private Lecturer lecturer;

    public Course(int id, String name, float weeklyDuration) {
        this.id = id;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeeklyDuration() {
        return weeklyDuration;
    }

    public void setWeeklyDuration(float weeklyDuration) {
        this.weeklyDuration = weeklyDuration;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void displayInfo() {
        System.out.println("Курс: " + name + " (ID: " + id + ")");
        System.out.println("  Недельная нагрузка: " + weeklyDuration + " часов");
        if (lecturer != null) {
            System.out.println("  Преподаватель: " + lecturer.getName());
        }
    }
}