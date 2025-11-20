import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Participation> participations;

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.participations = new ArrayList<>();
    }

    public void addParticipation(Participation participation) {
        participations.add(participation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void displayInfo() {
        System.out.println("Проект: " + name);
        System.out.println("  Период: " + startDate + " до " + endDate);
        System.out.println("  Участников: " + participations.size());
        for (Participation participation : participations) {
            System.out.println("    - " + participation.getResearchAssociate().getName() +
                    " (" + participation.getHours() + " часов)");
        }
    }
}