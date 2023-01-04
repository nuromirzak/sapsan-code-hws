package nineClassesHW;

import java.util.List;

public class King {
    private String name;
    private int age;
    private Queen wife;
    private List<Knight> army;

    public King() {
    }

    public King(String name, int age, Queen wife, List<Knight> army) {
        this.name = name;
        this.age = age;
        this.wife = wife;
        this.army = army;
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

    public Queen getWife() {
        return wife;
    }

    public void setWife(Queen wife) {
        this.wife = wife;
    }

    public List<Knight> getArmy() {
        return army;
    }

    public void setArmy(List<Knight> army) {
        this.army = army;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", queen=" + wife +
                ", army=" + army +
                '}';
    }
}
