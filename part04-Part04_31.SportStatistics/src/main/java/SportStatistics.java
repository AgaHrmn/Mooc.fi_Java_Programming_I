
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String filename = scan.nextLine();
        System.out.println("Team: ");
        String teamname = scan.nextLine();
        
        try {
            Scanner reader = new Scanner(Paths.get(filename));
            int gamecount = 0;
            int wins = 0;
            int losses = 0;
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                
                String hometeam = parts[0];
                String guestteam = parts[1];
                int homepoints = Integer.valueOf(parts[2]);
                int guestpoints = Integer.valueOf(parts[3]);
                
                if (hometeam.equals(teamname)){
                    gamecount++;
                    if (homepoints > guestpoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                if (guestteam.equals(teamname)){
                    gamecount++;
                    if (guestpoints > homepoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + gamecount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }

}
