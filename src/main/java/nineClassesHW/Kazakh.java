package nineClassesHW;

import java.util.Arrays;

public class Kazakh {
    private String name;
    private int age;
    private String zhuz;
    private String ru;
    private String city;
    private final String[] zhetiAta = new String[7];

    public Kazakh() {
    }

    public Kazakh(String name, int age, String zhuz, String ru, String city) {
        this.name = name;
        this.age = age;
        this.zhuz = zhuz;
        this.ru = ru;
        this.city = city;
    }

    public String setAtaAtIndex(int index, String ata) {
        if (index < 0 || index > 6) {
            throw new IllegalArgumentException("Индекс 0-ден 6-ға дейін болуы керек");
        }
        return zhetiAta[index] = ata;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getZhuz() {
        return zhuz;
    }

    public String getRu() {
        return ru;
    }

    public String getCity() {
        return city;
    }

    public String[] getZhetiAta() {
        return zhetiAta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setZhuz(String zhuz) {
        this.zhuz = zhuz;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Kazakh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zhuz='" + zhuz + '\'' +
                ", ru='" + ru + '\'' +
                ", city='" + city + '\'' +
                ", zhetiAta=" + Arrays.toString(zhetiAta) +
                '}';
    }
}
