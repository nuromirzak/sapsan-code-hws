package sapsan0401.figher_example;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Khabib", 178, 34, 90, 90, 70);
        Fighter fighter2 = new Fighter("McGregor", 173, 34, 85, 95, 77);
        Octagon.compareFighters(fighter1, fighter2);
    }
}
