package sapsan0401.figher_example;

public class Octagon {
    public static void compareFighters(Fighter fighter1, Fighter fighter2) {
        double average1 = fighter1.getAverage(), average2 = fighter2.getAverage();
        if (average1 > average2) System.out.printf("%s is better than %s", fighter1.getName(), fighter2.getName());
        else if (average1 < average2) System.out.printf("%s is better than %s", fighter2.getName(), fighter1.getName());
        else System.out.printf("%s and %s are equal", fighter1.getName(), fighter2.getName());
    }
}
