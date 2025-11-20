import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;
    private static int numberOfEmployers;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public static void setNumberOfEmployers(int number) {
        numberOfEmployers = number;
    }

    public void displayInfo() {
        System.out.println("Университет: " + name);
        System.out.println("Количество факультетов: " + faculties.size());
        System.out.println("Общее количество сотрудников: " + numberOfEmployers);
        for (Faculty faculty : faculties) {
            faculty.displayInfo();
        }
    }
}