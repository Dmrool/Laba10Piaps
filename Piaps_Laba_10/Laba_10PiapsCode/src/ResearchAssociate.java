import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private List<Institute> institutes;
    private List<Participation> participations;

    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.institutes = new ArrayList<>();
        this.participations = new ArrayList<>();
    }

    @Override
    public void work() {
        System.out.println(name + " проводит исследования в области " + fieldOfStudy);
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
        institute.addResearchAssociate(this);
    }

    public void addParticipation(Project project, int hours) {
        Participation participation = new Participation(this, project, hours);
        participations.add(participation);
        project.addParticipation(participation);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public List<Participation> getParticipations() {
        return participations;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Тип: Научный сотрудник, Область: " + fieldOfStudy);
        System.out.println("  Кафедры: " + institutes.size());
        System.out.println("  Проекты: " + participations.size());
    }

    public void displayResearchDetails() {
        System.out.println("Научный сотрудник: " + name);
        System.out.println("  Область исследований: " + fieldOfStudy);
        System.out.println("  Кафедры:");
        for (Institute institute : institutes) {
            System.out.println("    - " + institute.getName());
        }
        System.out.println("  Проекты:");
        for (Participation participation : participations) {
            System.out.println("    - " + participation.getProject().getName() +
                    " (" + participation.getHours() + " часов)");
        }
    }
}