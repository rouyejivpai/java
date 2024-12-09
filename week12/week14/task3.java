package week14;

public class task3 {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public task3(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }

    //** Remove a student from the course **/
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Move students[i + 1] to students[i], etc.
                for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }
                numberOfStudents--;
                break;
            }
        }
    }
}
class TestCourse {
    public static void main(String[] args) {
        task3 course1 = new task3("Data Structures");
        task3 course2 = new task3("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();

        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
    }
}