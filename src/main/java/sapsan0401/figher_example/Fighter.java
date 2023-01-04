package sapsan0401.figher_example;

public class Fighter {
    private String name;
    private int height;
    private int age;
    private int strength;
    private int speed;
    private int weight;

    public Fighter() {
    }

    public Fighter(String name, int height, int age, int strength, int speed, int weight) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
        this.weight = weight;
    }

    public double getAverage() {
        int sum = height + age + strength + speed + weight;
        return sum / 5d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", strength=" + strength +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
