# Student Information Management System (Console Application)

## 📌 Project Overview
This is a **Java console-based application** for managing student information, designed for use by **admission officers only**.  
The system uses **file storage** to save and retrieve data for:
- Officers (login credentials)
- Student records
- Advised courses

## 🔑 Features
- **Officer Login System**
  - Prompts for username and password
  - Validates credentials from `officers.txt`
  - Allows reattempt on incorrect password
- **Student Management**
  - Add new students with details: ID, name, program, batch, password, and CGPA
  - View all students (excluding passwords)
  - Search student information by ID
- **Course Assignment**
  - Assign multiple courses to a student
  - Search advised courses for a student by ID
- **File Storage**
  - `officers.txt` → Officer credentials
  - `students.txt` → Student details
  - `advised_courses.txt` → Assigned courses for students

## 📂 File Structure
/project-root
│── Main.java
│── Student.java
│── FileManager.java
│── officers.txt
│── students.txt
│── advised_courses.txt

📜 Sample officers.txt
admin,1234
officer1,pass1

📸 Example Console Output
Enter username: admin
Enter password: 1234
Login successful!

--- Menu ---
1. Add Student
2. View All Students
3. Search Student by ID
4. Assign Courses
5. Search Courses by Student ID
6. Exit

🎯 Project Status
Login System: ✔️
Student Management: ✔️
Course Management: ✔️
File Storage: ✔️
Presentation & Recording: 🕐 In progress

🖤 Developed With
Java (OOP + File Handling)
IntelliJ IDEA
Love for Clean & Simple Code ✨
