public class Main {
    public static void main(String[] args) {
        Name stud1 = new Name("muhd ","nazif"," Raya");
        Student mike = new Student("mike","2200","pulau pinang","skpp81");
        mike.addMarks(70);
        mike.addMarks(23);
        mike.addMarks(34);

        System.out.println("---Student Info---");
        System.out.println("Name: " + stud1.getFullName());
        System.out.println("ID: " + mike.getId());
        System.out.println("Marks: " + mike.getMarks());
        System.out.println("Maximum Marks: " + mike.getMax());
        System.out.println("Minimum Marks: " + mike.getMin());
        System.out.println("");

        Name stud2 = new Name("Muhd", "Hanis", "Afifi");
        Student hanis = new Student("hanis", "2233", "tganu","RMC");
        hanis.addMarks(70);
        hanis.addMarks(60);
        hanis.addMarks(50);

        System.out.println("---Student Info---");
        System.out.println("Name: " + stud2.getFullName());
        System.out.println("ID: " + hanis.getId());
        System.out.println("Marks: " + hanis.getMarks());
        System.out.println("Maximum Marks: " + hanis.getMax());
        System.out.println("Minimum Marks: " + hanis.getMin());
        System.out.println("");

        // tutor
        Name tutor1 = new Name("Nur", "Ira", "Jef");
        Tutor tia = new Tutor("13563236", "Selangor", "2 years teaching", 2, "05/12", 2);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + tutor1.getFullName());
        System.out.println("ID: " + tia.getId());
        System.out.println("Address: " + tia.getAddress());
        System.out.println("Qualifications: " + tia.getQualification());
        System.out.println("Year of Experience: " + tia.getYearsExp());
        System.out.println("Date Joined: " + tia.getDatejoin());
        System.out.println("Years since enter: " + tia.getYearService());
        System.out.println("");

        Name tutor2 = new Name("Sir", "Nordin", "Zakaria");
        Tutor nordin = new Tutor("12356546", "Selangor", "20 years teaching", 20, "2010", 20);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + tutor2.getFullName());
        System.out.println("ID: " + nordin.getId());
        System.out.println("Address: " + nordin.getAddress());
        System.out.println("Qualifications: " + nordin.getQualification());
        System.out.println("Year of Experience: " + nordin.getYearsExp());
        System.out.println("Date Joined: " + nordin.getDatejoin());
        System.out.println("Years since enter: " + nordin.getYearService());
        System.out.println("");

        TuitionCenter center1 = new TuitionCenter("Seri Iskandar");
        center1.addtutors(tia);
        center1.addtutors(nordin);
        center1.addnumberstudent(mike);
        center1.addnumberstudent(hanis);
        System.out.println("---Tuition Center Info---");
        System.out.println("Address: " + center1.getAddress());
        System.out.println("Number of tutors: " + center1.getnumtutors());
        System.out.println("Number of students: " + center1.getnumberstudent());
        System.out.println("Average student marks: " + center1.getAverageMarks());




    }
}