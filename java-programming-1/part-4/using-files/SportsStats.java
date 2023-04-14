import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class SportsStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("File: ");
        String fileName = input.nextLine();

        ArrayList<Team> teams = new ArrayList<>();

        boolean fileFound = makeList(fileName, teams);
        if (!fileFound) {
            input.close();
            return;
        }

        System.out.print("Team: ");
        String search = input.nextLine();
        input.close();

        for (Team team : teams) {
            if (team.getName().equals(search)) {
                System.out.println("Games: " + team.getGamesPlayed());
                System.out.println("Wins: " + team.getWins());
                System.out.println("Losses: " + team.getLosses());
                return;
            }
        }

        System.out.println("No team found by the name: " + search);

    }

    public static void updateTeams(String name, boolean gameWon, ArrayList<Team> teams) {
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                team.updateGames(gameWon);
                return;
            }
        }

        Team newTeam = new Team(name);
        newTeam.updateGames(gameWon);
        teams.add(newTeam);
    }

    public static boolean makeList(String fileName, ArrayList<Team> teams) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String[] row = scanner.nextLine().split(",");

                updateTeams(row[0], Integer.valueOf(row[2]) > Integer.valueOf(row[3]), teams);
                updateTeams(row[1], Integer.valueOf(row[2]) < Integer.valueOf(row[3]), teams);
            }

            return true;
        } catch (Exception e) {
            System.out.println("File '" + fileName + "' not found.");
            return false;
        }
    }

}
