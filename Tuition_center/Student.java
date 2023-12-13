import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String id;
    String address;
    String schoolname;
    ArrayList<Float> marks= new ArrayList<>(3);
    float total;



    public Student(String name, String id, String address, String schoolname) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.schoolname = schoolname;
        this.marks = new ArrayList<>(3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Float> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Float>marks) {
        this.marks = marks;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*
    public ArrayList<Float> floatInput(){
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= marks.size(); i++) {
            System.out.print("Enter mark " + i + ": ");
            Float mark = input.nextFloat();
            marks.add(mark);
        }
        return marks;
    }*/
    public void addMarks(float mark) {
        marks.add(mark);
    }


    public float getMax(){

        Float maxMarks = marks.get(0); // assume first mark as max initially
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > maxMarks) {
                maxMarks = marks.get(i);
            }
        }
        return maxMarks;
    }

    public float getMin(){
        float minMarks = marks.get(0); // assume first mark as min initially
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) < minMarks) {
                minMarks = marks.get(i);
            }
        }
        return minMarks;
    }


}
