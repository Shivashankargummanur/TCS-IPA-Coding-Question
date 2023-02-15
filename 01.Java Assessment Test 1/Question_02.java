import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {

    // Setting attributes
    private int playerid;
    private String playername;
    private int runs;
    private String playertype;
    private String matchtype;
    // Creating the parameterside constructer
    public Player(int playerid,String playername,int runs,String playertype,String matchtype)
    {
        this.playerid = playerid;
        this.playername = playername;
        this.runs = runs;
        this.playertype = playertype;
        this.matchtype = matchtype;
    }

    // Getters & Setters
    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }
    
    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }
    
    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayertype() {
        return playertype;
    }

    public void setPlayertype(String playertype) {
        this.playertype = playertype;
    }

    public String getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(String matchtype) {
        this.matchtype = matchtype;
    }




    
    

}

class Question_02 {

    // method for fiding the lowest runs of playertype
    public static int findPlayerWithLowestRuns(Player[] players,String inputplayertype)
    {
        int min = Integer.MAX_VALUE;
        for (Player player : players) {
            if (player.getPlayertype().equalsIgnoreCase(inputplayertype)) {
                if (player.getRuns() < min) {
                    min = player.getRuns();
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min;
        }
    }
    // method for finding the playerid for given matchtype in decending oredre
    public static Player[] findPlayerMatchType(Player[] players, String inputmatchtype)
    {
        int count = 0;
        // int min=Integer.MAX_VALUE;
        for (Player player : players) {
            if (player.getMatchtype().equalsIgnoreCase(inputmatchtype)) {

                count++;
            }
        }
        if(count==0)
        {
            return null;
        }
        else {
            Player[] arr = new Player[count];
            int i = 0;
            for (Player player : players) {
                if (player.getMatchtype().equalsIgnoreCase(inputmatchtype)) {
                    arr[i] = player;
                    i++;
                }

            }
            // sorting an array objects in decending order to follows this 
            Arrays.sort(arr, Comparator.comparing(Player::getPlayerid).reversed());

            return arr;
        }
       
       

        // System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating an array of object for class player 
        Player[] players = new Player[4];
        for(int i=0;i<players.length;i++)
        {
            int playerid = sc.nextInt();
            String playername = sc.next();
            int runs = sc.nextInt();
            String playertype = sc.next();
            String matchtype = sc.next();
            players[i] = new Player(playerid, playername, runs, playertype, matchtype);
        }
        String inputplayertype=sc.next();
        int lowestruns = findPlayerWithLowestRuns(players, inputplayertype);
        if(lowestruns>0)
        {
            System.out.println(lowestruns);
        }
        else {
            System.out.println("No such player");
        }
        String inputmatchtype=sc.next();
        Player[] arr = findPlayerMatchType(players, inputmatchtype);
        for (Player player : arr) {
            System.out.println(player.getPlayerid());
            
        }
    }
}