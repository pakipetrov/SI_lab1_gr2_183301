import java.util.List;

public class Faculty {
    
    private String name;
    private List<Student> students;
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void removeStudent(Student student) {
         students.remove(student);
    }
    
    public double getAverageGrade() {
        double averageGrade = 0;
        for (Student s : students) {
            averageGrade += s.getAverage();
        }
        return averageGrade / students.size();
    }
}
