public class Tutor {
    private Name name;
    private String id;
    private String address;
    private String qualification;
    private int yearsExp;
    private String datejoin;
    private int yearService;
    // constructor
    public Tutor(String id, String address, String qualification, int yearsExp,String datejoin, int yearService) {
        this.id = id;
        this.address = address;
        this.qualification = qualification;
        this.yearsExp = yearsExp;
        this.datejoin = datejoin;
        this.yearService = yearService;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(int yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getDatejoin() {
        return datejoin;
    }

    public void setDatejoin(String datejoin) {
        this.datejoin = datejoin;
    }

    public int getYearService() {
        return yearService;
    }

    public void setYearService(int yearService) {
        this.yearService = yearService;
    }
}
