package nineClassesHW;

public class Student {
    private String name;
    private String university;
    private int age;
    private double gpa;
    private String major;

    public Student() {
    }

    public Student(String name, String university, int age, double gpa, String major) {
        this.name = name;
        this.university = university;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                '}';
    }
}
