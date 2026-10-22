public class Student {

    // Seven private attributes
    private String studentId;
    private String name;
    private int age;
    private String course;
    private int semester;
    private double cgpa;
    private boolean isRegistered;

    // Default constructor to assigns initial values to all seven attributes
    public Student() {
        studentId = "Unknown";
        name = "Unknown";
        age = 0;
        course = "Unknown";
        semester = 1;
        cgpa = 0.0;
        isRegistered = false;
    }

    // Parameterized constructor 
    // Allows student information to be provided when creating an object.
    // Setters are used to assign the values and check their validity.
    public Student(String studentId, String name, int age,
                   String course, int semester, double cgpa,
                   boolean isRegistered) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setCourse(course);
        setSemester(semester);
        setCgpa(cgpa);
        setIsRegistered(isRegistered);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }

    // Setters with basic validation
   public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

     public void setCourse(String course) {
        this.course = course;
    }

    public void setSemester(int semester) {
        if (semester >= 1 && semester <= 20) {
            this.semester = semester;
        }
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        }
    }

    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    // Additional method 1: Register a student
    // Registers the student by changing the registration status to true.
    public void registerStudent() {
        isRegistered = true;
        System.out.println(name + " has been registered.");
    }

    // Additional method 2: Display student information
    // Displays all student information by using getter methods, it also displays the student's academic status.
    public void displayStudentInfo() {
        System.out.println("\n------------------------------");
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + getCourse());
        System.out.println("Semester: " + getSemester());
        System.out.printf("CGPA: %.2f%n", getCgpa());
        System.out.println("Registered: " + getIsRegistered());
        System.out.println("Academic Status: " + checkAcademicStatus());
        System.out.println("------------------------------");
    }

    // Additional method 3: Check academic status
    // Uses if-else statements to determine academic performance based on the student's CGPA.
    public String checkAcademicStatus() {
        if (cgpa >= 3.50) {
            return "Excellent";
        } else if (cgpa >= 3.00) {
            return "Good";
        } else if (cgpa >= 2.00) {
            return "Satisfactory";
        } else {
            return "Needs Improvement";
        }
    }

    // Additional method 4: Check registration status
    // Returns true if the student is registered; otherwise, false.
    public boolean checkRegistration() {
        return isRegistered;
    }

    // Additional method 5: Advance to the next semester
    // Increases the student's semester by one and prevents the semester from exceeding 20.
    public void updateSemester() {
        if (semester < 20) {
            semester++;
            System.out.println(name + " has advanced to semester "
                    + semester + ".");
        } else {
            System.out.println("Maximum semester reached.");
        }
    }
}
