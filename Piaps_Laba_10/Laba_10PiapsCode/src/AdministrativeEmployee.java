public class AdministrativeEmployee extends Employee {
    private String department;

    public AdministrativeEmployee(int ssNo, String name, String email, String department) {
        super(ssNo, name, email);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " выполняет административные обязанности в " + department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Тип: Административный, Отдел: " + department);
    }
}