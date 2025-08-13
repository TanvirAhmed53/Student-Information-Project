import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (manager.authenticateOfficer(user, pass)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid Identity. Try again.");
            }
        }

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Show All Students");
            System.out.println("4. Add Course to Student");
            System.out.println("5. Search Courses by Student ID");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Program: ");
                    String program = sc.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = Double.parseDouble(sc.nextLine());
                    manager.addStudent(id, name, program, batch, password, cgpa);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    manager.searchStudent(sc.nextLine());
                    break;
                case 3:
                    manager.showAllStudents();
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Enter Course Code: ");
                    String course = sc.nextLine();
                    manager.addCourse(sid, course);
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    manager.searchCourses(sc.nextLine());
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
