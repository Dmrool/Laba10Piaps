public class Participation {
    private ResearchAssociate researchAssociate;
    private Project project;
    private int hours;

    public Participation(ResearchAssociate researchAssociate, Project project, int hours) {
        this.researchAssociate = researchAssociate;
        this.project = project;
        this.hours = hours;
    }

    public ResearchAssociate getResearchAssociate() {
        return researchAssociate;
    }

    public Project getProject() {
        return project;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}