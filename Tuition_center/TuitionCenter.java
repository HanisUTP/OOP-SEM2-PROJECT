import java.util.ArrayList;
import java.util.List;
public class TuitionCenter {
    private String address;
    private List<Tutor> tutors;
    private List<Student> students;
    public TuitionCenter(String address){
        this.address = address;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // operation
    public void addtutors(Tutor tutor) {
        tutors.add(tutor);
    }
    public void removetutors(Tutor tutor) {
        tutors.remove(tutor);
    }
    public int getnumtutors(){ // to count number of tutor
        return tutors.size();
    }

    public void addnumberstudent(Student student) {
        students.add(student);
    }
    public void removestud(Student student) {
        students.remove(student);
    }
    public int getnumberstudent(){
        return students.size();
    }
    public double getAverageMarks() {
        float totalmarks = 0;
        float nummarks = 0;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                totalmarks += mark;
                nummarks++;
            }
        }
        if (nummarks > 0) {
            return (float) totalmarks / nummarks;
        } else {
            return 0;
        }
    }





}
