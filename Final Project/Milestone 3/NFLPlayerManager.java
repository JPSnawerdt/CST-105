/*
My Name is John Snawerdt and this is my own work.
 */
package nflplayer;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class NFLPlayerManager {
    
    public ArrayList<NFLPlayer> Players = new ArrayList<>();
    
    public NFLPlayerManager(){
        
    }
    public void createPlayers(){
        Players.add(new NFLPlayer("Bob Smith", 22, 72, 235, "RB", 87, 1500, 0, 0, 1200, 10, 0, 82, 87));
        Players.add(new NFLPlayer("Rodney Harris", 19, 67, 200, "QB", 76, 200, 4500, 0, 0, 10, 0, 55, 67));
        Players.add(new NFLPlayer("Alex Welch", 24, 75, 185, "WR", 99, 200, 0, 0, 2000, 32, 0, 99, 99));
        Players.add(new NFLPlayer("Andre Gonzalez", 24, 72, 185, "CB", 82, 0, 0, 32, 0, 0, 2, 88, 65));
        Players.add(new NFLPlayer("Tony Nathu", 24, 75, 185, "LB", 76, 0, 0, 23, 0, 0, 10, 55, 68));
        Players.add(new NFLPlayer("Peter Danks", 22, 75, 300, "DT", 99, 0, 0, 28, 0, 0, 10, 35, 25));
    }
        @Override
    	public String toString() {
		String list = "";
		for (NFLPlayer n : Players)
			list += ("Name: " + n.name + " Postion:" + n.position + "\n");
		return list;
	}
        

        //main to test NFLPlayerManager
        static public void main(String[] args){
            NFLPlayerManager NFLPlayers= new NFLPlayerManager();
            NFLPlayers.createPlayers();
            System.out.println(NFLPlayers);
        }
}
