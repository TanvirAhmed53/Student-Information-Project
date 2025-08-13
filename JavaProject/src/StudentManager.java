import java.io.RandomAccessFile;
import java.io.IOException;

public class StudentManager {

    public boolean authenticateOfficer(String username, String password) {
        try {
            RandomAccessFile raf = new RandomAccessFile("officers.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    if (parts[0].equals(username) && parts[1].equals(password)) {
                        raf.close();
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: ");
        }
        return false;
    }

    public void addStudent(String id, String name, String program, String batch, String password, double cgpa) {
        try {
            RandomAccessFile raf = new RandomAccessFile("students.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(id + "," + name + "," + program + "," + batch + "," + password + "," + cgpa + "\n");
            raf.close();
            System.out.println("Student added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing student file: ");
        }
    }

    public void searchStudent(String id) {
        try {
            RandomAccessFile raf = new RandomAccessFile("students.txt", "r");
            String line;
            boolean found = false;
            while ((line = raf.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6 && parts[0].equals(id)) {
                    System.out.println("ID: " + parts[0]);
                    System.out.println("Name: " + parts[1]);
                    System.out.println("Program: " + parts[2]);
                    System.out.println("Batch: " + parts[3]);
                    System.out.println("CGPA: " + parts[5]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Error reading student file: ");
        }
    }

    public void showAllStudents() {
        try {
            RandomAccessFile raf = new RandomAccessFile("students.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    System.out.println(parts[0] + " | " + parts[1] + " | " + parts[2] + " | " + parts[3] + " | " + parts[5]);
                }
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Error reading student file: ");
        }
    }
    public void addCourse(String id, String courseCode) {
        try {
            RandomAccessFile raf = new RandomAccessFile("advised_courses.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(id + "," + courseCode + "\n");
            raf.close();
            System.out.println("Course added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing courses file: " );
        }
    }
    public void searchCourses(String id) {
        try {
            RandomAccessFile raf = new RandomAccessFile("advised_courses.txt", "r");
            String line;
            boolean found = false;
            while ((line = raf.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(id)) {
                    System.out.println("Course: " + parts[1]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No courses found for this student.");
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Error reading courses file: " );
        }
    }
}
