import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers(){
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }

}
