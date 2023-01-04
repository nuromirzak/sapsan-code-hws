package nineClassesHW;

public class Indian {
    private String name;
    private int age;
    private String state;
    private String city;
    private String language;

    public Indian() {
    }

    public Indian(String name, int age, String state, String city, String language) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.city = city;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Indian{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
