package nineClassesHW;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        footballPlayerExample();
        kingdomExample();
        familyExample();
        studentExample();
        indianExample();
        kazakhExample();
    }

    public static void footballPlayerExample() {
        FootballPlayer footballPlayer = new FootballPlayer("Neymar JR", 10, FootballPlayer.PlayerPosition.FORWARD, "PSG", "Brazil");
        System.out.println(footballPlayer);
    }

    public static void kingdomExample() {
        King king = new King();
        king.setName("Richard I");
        king.setAge(40);
        Queen queen = new Queen();
        queen.setName("Berengaria of Navarre");
        queen.setAge(35);
        king.setWife(queen);

        Knight knight1 = new Knight("Adame the Mild", 21);
        Knight knight2 = new Knight("Clifton the Merciful", 29);
        Knight knight3 = new Knight("Drest the Smile", 18);
        Knight knight4 = new Knight("Charle the Noble", 37);

        List<Knight> army = List.of(knight1, knight2, knight3, knight4);
        king.setArmy(army);

        System.out.println(king);
    }

    public static void familyExample() {
        Mother mother = new Mother("Jane", "Physician", 25);
        Father father = new Father("John", mother, "Software Engineer", 25);
        System.out.println(father);
    }

    public static void studentExample() {
        Student student = new Student("Max", "California Institute of Technology", 19, 3.8, "Civil Engineering");
        System.out.println(student);
    }

    public static void indianExample() {
        Indian indian = new Indian("Aryabhata", 20, "Telangana", "Hyderabad", "Telugu");
        System.out.println(indian);
    }

    public static void kazakhExample() {
        Kazakh kazakh = new Kazakh("Мұрат", 15, "Uly", "Dulat", "Almaty");
        kazakh.setAtaAtIndex(0, "Шымыр");
        kazakh.setAtaAtIndex(1, "Бекболат");
        kazakh.setAtaAtIndex(2, "Шілменбет");
        kazakh.setAtaAtIndex(3, "Құли");
        kazakh.setAtaAtIndex(4, "Амалдық");
        kazakh.setAtaAtIndex(5, "Баубек");
        kazakh.setAtaAtIndex(6, "Үсен");
        System.out.println(kazakh);
    }
}
