package nineClassesHW;

public class Father {
    private String name;
    private Mother wife;
    private String job;
    private int age;

    public Father() {
    }

    public Father(String name, Mother wife, String job, int age) {
        this.name = name;
        this.wife = wife;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mother getWife() {
        return wife;
    }

    public void setWife(Mother wife) {
        this.wife = wife;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", wife=" + wife +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
