package model;

/**
 * Created by Kevin on 9/3/2016.
 */
public class Roster {
    private final String playerName;
    private final int imgPlayer;
    private final String playerNumber;
    private final String playerPos;
    private final String playerClass;
    private final String playerState;
    private final String playerExperience;
    private final String playerHighSchool;
    private final String playerMajor;
    private final String playerBorn;
    private final String playerHeight;
    private final String playerWeight;

    public Roster(String playerName, int imgPlayer, String playerNumber, String playerPos, String playerClass, String playerState, String playerExperience, String playerHighSchool, String playerMajor, String playerBorn, String playerHeight, String playerWeight){
        this.playerName = playerName;
        this.imgPlayer = imgPlayer;
        this.playerNumber = playerNumber;
        this.playerPos = playerPos;
        this.playerClass = playerClass;
        this.playerState = playerState;
        this.playerExperience = playerExperience;
        this.playerHighSchool = playerHighSchool;
        this.playerMajor = playerMajor;
        this.playerBorn = playerBorn;
        this.playerWeight = playerWeight;
        this.playerHeight = playerHeight;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getImgPlayer() {
        return imgPlayer;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public String getPlayerPos() {
        return playerPos;
    }

    public String getPlayerState() {
        return playerState;
    }

    public String getPlayerBorn() {
        return playerBorn;
    }

    public String getPlayerExperience() {
        return playerExperience;
    }

    public String getPlayerHeight() {
        return playerHeight;
    }

    public String getPlayerHighSchool() {
        return playerHighSchool;
    }

    public String getPlayerMajor() {
        return playerMajor;
    }

    public String getPlayerWeight() {
        return playerWeight;
    }
}
