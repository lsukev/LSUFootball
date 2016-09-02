package model;

/**
 * Created by lsuke on 9/2/2016.
 */
public class Schedule {
    private final String awayTeam;
    private final String homeTeam;
    private final String gameDate;
    private final String gameVenue;
    private final String awayLogo;
    private final String homeLogo;

    public Schedule(String awayTeam, String homeTeam, String gameDate, String gameVenue, String awayLogo, String homeLogo){
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.gameDate = gameDate;
        this.gameVenue = gameVenue;
        this.awayLogo = awayLogo;
        this.homeLogo = homeLogo;
    }
    public String getAwayTeam(){
        return awayTeam;
    }
    public String getHomeTeam(){
        return homeTeam;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getGameVenue() {
        return gameVenue;
    }

    public String getAwayLogo() {
        return awayLogo;
    }

    public String getHomeLogo() {
        return homeLogo;
    }
}
