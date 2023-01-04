package nineClassesHW;

public class FootballPlayer {
    public static enum PlayerPosition {
        GOALKEEPER, DEFENDER, MIDFIELDER, FORWARD
    }
    private String name;
    private int kitNumber;
    private PlayerPosition position;
    private String club;
    private String nationalTeam;

    public FootballPlayer() {
    }

    public FootballPlayer(String name, int kitNumber, PlayerPosition position, String club, String nationalTeam) {
        this.name = name;
        this.kitNumber = kitNumber;
        this.position = position;
        this.club = club;
        this.nationalTeam = nationalTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(int kitNumber) {
        this.kitNumber = kitNumber;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(String nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", kitNumber=" + kitNumber +
                ", position=" + position +
                ", club='" + club + '\'' +
                ", nationalTeam='" + nationalTeam + '\'' +
                '}';
    }
}
