public class Main {

    public static void main(String[] args) {

        // 1. Create object using default constructor 
        // Creates a student with default values first.
        Student student1 = new Student();

        // Set student1 attributes using setter methods to assign student information.
        student1.setStudentId("S1001");
        student1.setName("Alex Tan");
        student1.setAge(20);
        student1.setCourse("Computer Science");
        student1.setSemester(2);
        student1.setCgpa(3.60);
        student1.setIsRegistered(false);

        // 2. Create the second student using the parameterized constructor
        Student student2 = new Student("S1002", "Sarah Lim", 21, "Information Technology", 3, 3.20, true);

        // Displays the program title.
        System.out.println("==================================");
        System.out.println("      STUDENT MANAGEMENT SYSTEM");
        System.out.println("==================================");

        // 3. Displays the information of both students.
        System.out.println("\nFIRST STUDENT");
        student1.displayStudentInfo();

        System.out.println("\nSECOND STUDENT");
        student2.displayStudentInfo();

        // 4. Demonstrate getter methods
        // Retrieves and displays selected student information.
        System.out.println("\n--- GETTER DEMONSTRATION ---");
        System.out.println("Student name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Current CGPA: " + student1.getCgpa());

        // 5. Demonstrates changing a value using a setter.
        System.out.println("\n--- UPDATE CGPA ---");
        student1.setCgpa(3.80);

        // Uses getters to display the updated values.
        System.out.println("Updated CGPA: " + student1.getCgpa());
        System.out.println("Updated academic status: " + student1.checkAcademicStatus());

        // 6. Demonstrate if-else selection
        // Checks the registration status and registers the student if the student is not already registered.
        System.out.println("\n--- REGISTRATION CHECK ---");

        if (student1.checkRegistration()) {
            System.out.println(student1.getName() + " is already registered.");
        } else {
            System.out.println(student1.getName() + " is not registered.");

            // Register the student
            student1.registerStudent();
        }

        // 7. Demonstrate switch selection
        // Selects a message based on the student's academic status.
        System.out.println("\n--- ACADEMIC PERFORMANCE ---");

        switch (student1.checkAcademicStatus()) {
            case "Excellent":
                System.out.println("Outstanding academic performance!");
                break;

            case "Good":
                System.out.println("Good academic performance.");
                break;

            case "Satisfactory":
                System.out.println("Satisfactory academic performance.");
                break;

            default:
                System.out.println("Academic improvement is needed.");
        }

        // 8. Demonstrate a for loop
        // Displays each semester from 1 to the student's current semester.

        // Display the section heading.
        System.out.println("\n--- SEMESTER PROGRESS ---");

        for (int i = 1; i <= student1.getSemester(); i++) {
            System.out.println("Semester " + i);
        }

        // 9. Demonstrate a while loop 
        // This while loop repeats twice to check the registration status of both students.


        System.out.println("\n--- STUDENT REGISTRATION REVIEW ---");

        // Initialize the counter at 0.
        int count = 0;

        // Repeat the loop while count is less than 2.
        while (count < 2) {

            // Create a variable to store the student being reviewed.
            Student currentStudent;

            // If count is 0, select the first student.
            if (count == 0) {
                currentStudent = student1;
            } else {
                // Otherwise, select the second student.
                currentStudent = student2;
            }

             // Displays the selected student's registration status.
            System.out.println("\nReviewing: " + currentStudent.getName());

            if (currentStudent.checkRegistration()) {
                System.out.println("Registration status: Registered");
            } else {
                System.out.println("Registration status: Not registered");
            }

            // Increase count by 1 to move to the next student.
            count++;
        }

        // 10. Demonstrates changing the semester using a method.
        System.out.println("\n--- UPDATE SEMESTER ---");
        student1.updateSemester();

        System.out.println("Current semester: " + student1.getSemester());

        // Indicates that the program has finished.
        System.out.println("\nProgram completed successfully.");
    }
}
