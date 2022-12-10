package homework7;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class RockPaperScissorsGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Shape> mapStringToShapeEnum = Map.of(
            "rock", Shape.ROCK,
            "paper", Shape.PAPER,
            "scissors", Shape.SCISSORS
    );
    private final int numberOfRounds;
    private int player1Score;
    private int CPUScore;
    private final Random random;
    public static final String longLine = "------------------------------------------------------------";

    private RockPaperScissorsGame(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
        this.player1Score = 0;
        this.CPUScore = 0;
        this.random = new Random();
    }

    public static RockPaperScissorsGame initializeGame() {
        System.out.println("How many rounds do you want to play?");
        int numberOfRounds = scanner.nextInt();
        if (numberOfRounds < 1) {
            throw new IllegalArgumentException("Number of rounds must be greater than 0");
        }
        return new RockPaperScissorsGame(numberOfRounds);
    }

    public void playGame() {
        greetPlayers();
        for (int i = 0; i < numberOfRounds; i++) {
            System.out.println(longLine);
            System.out.println("Round " + (i + 1));
            System.out.print("Player 1: ");
            String player1Shape;
            while (true) {
                player1Shape = scanner.next();
                if (mapStringToShapeEnum.containsKey(player1Shape.toLowerCase())) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter \"rock\", \"paper\", or \"scissors\".");
                }
            }
            String CPUShape = getRandomShape();
            System.out.println("CPU: " + CPUShape);
            playRound(player1Shape, CPUShape);
        }
        sayGoodbye();
    }

    private void greetPlayers() {
        System.out.println(longLine);
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("You will be playing " + numberOfRounds + " rounds.");
        System.out.println("You may enter \"rock\", \"paper\", or \"scissors\" in any case.");
        System.out.println("Let's begin!");
    }

    private void playRound(String player1Shape, String player2Shape) {
        int winner = getWinner(player1Shape, player2Shape);
        if (winner == 0) {
            System.out.print("It's a tie!");
        } else if (winner == 1) {
            System.out.print("Player 1 wins!");
            player1Score++;
        } else {
            System.out.print("CPU wins!");
            CPUScore++;
        }
        System.out.println(" Score: " + player1Score + " - " + CPUScore);
    }

    private void sayGoodbye() {
        System.out.println(longLine);
        System.out.println("Thanks for playing!");
        System.out.println("Player 1 score: " + player1Score);
        System.out.println("CPU score: " + CPUScore);
        if (player1Score > CPUScore) {
            System.out.println("Player 1 wins!");
        } else if (player1Score < CPUScore) {
            System.out.println("CPU wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static int getWinner(String shape1, String shape2) {
        Shape shape1Enum = mapStringToShapeEnum.get(shape1.toLowerCase());
        Shape shape2Enum = mapStringToShapeEnum.get(shape2.toLowerCase());
        return compareShapes(shape1Enum, shape2Enum);
    }

    private static int compareShapes(Shape shape1, Shape shape2) {
        String shape1Name = shape1.name();
        String shape2Name = shape2.name();

        if (shape1Name.equals(shape2Name)) {
            return 0;
        } else if (shape1Name.equals("Rock")) {
            if (shape2Name.equals("Paper")) {
                return -1;
            } else {
                return 1;
            }
        } else if (shape1Name.equals("Paper")) {
            if (shape2Name.equals("Scissors")) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (shape2Name.equals("Rock")) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    private String getRandomShape() {
        int randomIndex = random.nextInt(Shape.values().length);
        return Shape.values()[randomIndex].name();
    }
}
