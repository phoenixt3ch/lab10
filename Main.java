import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faculty name: ");
        String facultyName = scanner.nextLine();

        System.out.print("Project name: ");
        String projectName = scanner.nextLine();

        System.out.print("Dean name: ");
        String deanName = scanner.nextLine();
        System.out.print("Dean email: ");
        String deanEmail = scanner.nextLine();
        System.out.print("Dean social security number: ");
        int deanSsNo = scanner.nextInt();
        System.out.println();

        Employee dean = new AdministrativeEmployee(deanSsNo, deanName, deanEmail);
        Faculty faculty = new Faculty(dean, facultyName);
        Project project = new Project(projectName, new Date(2024, 12, 2), new Date(2024, 12, 19));

        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Dean: " + dean.getName());
        System.out.println("Project: " + project.getName() + " starting " + project.getStart() + " ending " + project.getEnd());
    }
}
