import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание университета
            University university = new University("ВГУ");

            // Создание факультетов
            Faculty csFaculty = new Faculty("Факультет компьютерных наук");
            Faculty eeFaculty = new Faculty("Электротехнический факультет");

            university.addFaculty(csFaculty);
            university.addFaculty(eeFaculty);

            // Создание кафедр
            Institute softwareInstitute = new Institute("Кафедра программной инженерии", "Здание А, кабинет 101");
            Institute aiInstitute = new Institute("Кафедра искусственного интеллекта", "Здание Б, кабинет 205");
            Institute powerInstitute = new Institute("Кафедра энергетических систем", "Здание В, кабинет 301");

            csFaculty.addInstitute(softwareInstitute);
            csFaculty.addInstitute(aiInstitute);
            eeFaculty.addInstitute(powerInstitute);

            // Создание сотрудников
            AdministrativeEmployee admin = new AdministrativeEmployee(1001, "Иван Петров", "ivan.petrov@university.edu", "Отдел кадров");
            ResearchAssociate researcher1 = new ResearchAssociate(1002, "Доктор Анна Смирнова", "anna.smirnova@university.edu", "Машинное обучение");
            ResearchAssociate researcher2 = new ResearchAssociate(1003, "Доктор Сергей Иванов", "sergey.ivanov@university.edu", "Наука о данных");
            Lecturer lecturer1 = new Lecturer(1004, "Профессор Мария Козлова", "maria.kozlova@university.edu", "Компьютерные науки");

            // Назначение декана
            csFaculty.setDean(lecturer1);

            // Прикрепление исследователей к кафедрам
            researcher1.addInstitute(aiInstitute);
            researcher2.addInstitute(softwareInstitute);
            researcher2.addInstitute(aiInstitute);
            lecturer1.addInstitute(softwareInstitute);

            // Создание проектов
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Project project1 = new Project("Исследование ИИ", sdf.parse("2024-01-01"), sdf.parse("2024-12-31"));
            Project project2 = new Project("Разработка блокчейн системы", sdf.parse("2024-03-01"), sdf.parse("2024-11-30"));

            // Участие в проектах
            researcher1.addParticipation(project1, 20);
            researcher2.addParticipation(project1, 15);
            researcher2.addParticipation(project2, 10);
            lecturer1.addParticipation(project2, 5);

            // Создание курсов
            Course course1 = new Course(101, "Введение в программирование", 4.0f);
            Course course2 = new Course(201, "Структуры данных", 3.0f);
            Course course3 = new Course(301, "Машинное обучение", 3.5f);

            // Назначение преподавателей на курсы
            lecturer1.teachCourse(course1);
            lecturer1.teachCourse(course2);
            lecturer1.teachCourse(course3);

            // Вывод информации
            System.out.println("=== ИНФОРМАЦИОННАЯ СИСТЕМА УНИВЕРСИТЕТА ===");
            System.out.println();

            university.displayInfo();

            System.out.println("\n=== ИНФОРМАЦИЯ О СОТРУДНИКАХ ===");
            admin.displayInfo();
            researcher1.displayInfo();
            researcher2.displayInfo();
            lecturer1.displayInfo();

            System.out.println("\n=== ДЕТАЛИ ИССЛЕДОВАТЕЛЬСКОЙ ДЕЯТЕЛЬНОСТИ ===");
            researcher1.displayResearchDetails();

            System.out.println("\n=== ИНФОРМАЦИЯ О ПРОЕКТАХ ===");
            project1.displayInfo();
            project2.displayInfo();

            System.out.println("\n=== ИНФОРМАЦИЯ О КУРСАХ ===");
            course1.displayInfo();
            course2.displayInfo();
            course3.displayInfo();

            System.out.println("\n=== РАБОЧАЯ ДЕЯТЕЛЬНОСТЬ ===");
            admin.work();
            researcher1.work();
            researcher2.work();
            lecturer1.work();

            // Дополнительная статистика
            System.out.println("\n=== СТАТИСТИКА СИСТЕМЫ ===");
            System.out.println("Всего сотрудников в университете: " + University.getNumberOfEmployers());
            System.out.println("Всего факультетов: " + university.getFaculties().size());
            System.out.println("Всего кафедр: " + (csFaculty.getInstitutes().size() + eeFaculty.getInstitutes().size()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}