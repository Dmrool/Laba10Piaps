public abstract class Employee {
    protected int ssNo;
    protected String name;
    protected String email;
    protected static int counter = 0;

    public Employee(int ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        counter++;
        University.setNumberOfEmployers(counter);
    }

    public abstract void work();

    // Геттеры и сеттеры
    public int getSsNo() {
        return ssNo;
    }

    public void setSsNo(int ssNo) {
        this.ssNo = ssNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }

    public void displayInfo() {
        System.out.println("Сотрудник: " + name + ", СНИЛС: " + ssNo + ", Email: " + email);
    }
}