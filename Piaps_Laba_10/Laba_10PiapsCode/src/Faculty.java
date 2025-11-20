import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Employee dean;
    private List<Institute> institutes;

    public Faculty(String name) {
        this.name = name;
        this.institutes = new ArrayList<>();
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public void removeInstitute(Institute institute) {
        institutes.remove(institute);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return dean;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public void displayInfo() {
        System.out.println("  Факультет: " + name);
        if (dean != null) {
            System.out.println("  Декан: " + dean.getName());
        }
        System.out.println("  Количество кафедр: " + institutes.size());
        for (Institute institute : institutes) {
            institute.displayInfo();
        }
    }
}