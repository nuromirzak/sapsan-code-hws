package sapsan0401.family_example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Father father = new Father("Kairat", "Nurtas", 30, 1000000);
        Mother mother = new Mother("Aruzhan", "Nurtas", 30, 700000);
        Child child1 = new Child("Daulet", "Nurtas", 13, "NIS");
        Child child2 = new Child("Aruzhan", "Nurtas", 11, "NIS");
        Child child3 = new Child("Aigerim", "Nurtas", 9, "МБОУ СОШ");
        Family family = new Family(father, mother, List.of(child1, child2, child3));
        System.out.println(family);
    }
}