public class Student {
    private String name;
    private int semester;
    private String course;
    private boolean isEligible;

    public Student() {
        this.name = "Unknown";
        this.semester = 0;
        this.course = "Unknown";
    }

    public Student(String name, int semester, String course) {
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    public String toString() {
        if(this.isEligible) {
            return "The student " + name + " is studying " + course + " in semester " + semester + " is eligible to get credit exemption.";
        } else {
            return "The student " + name + " is studying " + course + " in semester " + semester + " is not eligible to get credit exemption.";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void checkEligibility() {
        if(this.semester == 4 || this.semester == 5 || this.semester == 6) {
            isEligible =  true;
        } else {
            isEligible = false;
        }
    }

    
}
