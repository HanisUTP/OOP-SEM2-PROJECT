import java.util.ArrayList;
import java.util.Scanner;

public class Batch {

    ArrayList<Student> studbatch= new ArrayList<>();

    public Batch() {
        this.studbatch = new ArrayList<>();
    }
    public void addStud(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student to add ");
        int add=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<add;i++) {
            studbatch.add(student);
        }
    }

    public void removeStudent(Student student) {
        studbatch.remove(student);
    }
/*
    public void viewstud(){
        if (studbatch.isEmpty()) {
            System.out.println("No students added yet!");
        } else {
            System.out.println("List of students:");
            for (String student : student) {
                System.out.println("- " + student);
            }
        }
    }*/



}
