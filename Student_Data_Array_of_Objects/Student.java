class Student {
    private String name;
    private int prn;
    private String dob;

    // Corrected constructor
    Student(int prn, String name, String dob) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
    }

    // Setter and getter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and getter methods for PRN
    public void setPRN(int prn) {
        this.prn = prn;
    }

    public int getPRN() {
        return prn;
    }

    // Setter and getter methods for DOB
    public void setDOB(String dob) {
        this.dob = dob;
    }

    public String getDOB() {
        return dob;
    }
}