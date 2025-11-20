import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private String address;
    private List<ResearchAssociate> researchAssociates;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
        this.researchAssociates = new ArrayList<>();
    }

    public void addResearchAssociate(ResearchAssociate researcher) {
        researchAssociates.add(researcher);
    }

    public void removeResearchAssociate(ResearchAssociate researcher) {
        researchAssociates.remove(researcher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ResearchAssociate> getResearchAssociates() {
        return researchAssociates;
    }

    public void displayInfo() {
        System.out.println("    Кафедра: " + name + ", Адрес: " + address);
        System.out.println("    Количество исследователей: " + researchAssociates.size());
    }
}