public class Team {
    private String name;
    private int played;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
        this.played = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getGamesPlayed() {
        return this.played;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public void updateGames(boolean gameWon) {
        if (gameWon)
            this.wins++;
        else
            this.losses++;

        this.played++;
    }

}
