/*
My Nameis John Snawerdt and this is my own work
 */
package nfldraft;


import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author John
 */
public class NFLPlayerManager {
    
    public static ArrayList<NFLPlayer> Players = new ArrayList<>();
    
    public NFLPlayerManager(){
        
    }
    //String name,int age, double height, double weight, String position, int grade, int speed, int elusiveness,
            //int rushingyards, int passingyards, int touchdowns, int receivingyards, int interceptionsthrown, int lostfumbles, String status
    public void createPlayers(){
        Players.add(new OffensivePlayer("Bob Smith", 22, 72, 235, "RB", 87, 87, 75, 1200, 0, 10, 0, 0, 3, "Not Drafted"));
        Players.add(new OffensivePlayer("Rodney Harris", 19, 67, 200, "QB", 76, 55, 45, 0, 3200, 10, 0, 4, 3, "Not Drafted"));
        Players.add(new OffensivePlayer("Alex Welch", 24, 75, 185, "WR", 99, 88, 99, 0, 0, 32, 1800, 0, 0, "Not Drafted"));
        Players.add(new DefensivePlayer("Andre Gonzalez", 24, 72, 185, "CB", 82, 87, 87, 50, 1, 1, 1, "Not Drafted"));
        Players.add(new DefensivePlayer("Tony Nathu", 24, 75, 185, "LB", 76, 75, 78, 67, 25, 1, 3, "Not Drafted" ));
        Players.add(new DefensivePlayer("Peter Danks", 22, 75, 300, "DT", 99, 50, 15, 50, 4, 0, 5, "Not Drafted"));
    }//String name, int age, double height, double weight, String position, int grade, int speed, int elusiveness,
            //int tackles, int sacks, int interceptions, int forcedfumbles, String status
        @Override
    	public String toString() {
		String list = "";
		for (NFLPlayer n : Players)
			list += ("Name: " + n.name + " Postion:" + n.position + "\n");
		return list;
	}
        

        //main to test NFLPlayerManager
        static public void main(String[] args){

        }
}
