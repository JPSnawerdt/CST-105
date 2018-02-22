/*
My name is John Snawerdt and this is my own work.
 */
package nfldraft;

import javafx.beans.property.SimpleStringProperty;


public class DefensivePlayer extends NFLPlayer {
    private int tackles;
    private int sacks;
    private int interceptions;
    private int forcedfumbles;
    
    public DefensivePlayer(){
        
    }
    
    public DefensivePlayer(String name, int age, double height, double weight, String position, int grade, int speed, int elusiveness,
            int tackles, int sacks, int interceptions, int forcedfumbles, String status){
        this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
                this.position = position;
                this.grade = grade;
                this.speed = speed;
                this.elusiveness = elusiveness;
                this.tackles= tackles;
                this.sacks= sacks;
                this.interceptions=interceptions;
                this.forcedfumbles=forcedfumbles;
                this.status=new SimpleStringProperty(status);
    }
    @Override
    public String toString(){
            return "Name:" +name;
            
            
        }
    /**
     * @return the tackles
     */
    public int getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    /**
     * @return the sacks
     */
    public int getSacks() {
        return sacks;
    }

    /**
     * @param sacks the sacks to set
     */
    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    /**
     * @return the interceptions
     */
    public int getInterceptions() {
        return interceptions;
    }

    /**
     * @param interceptions the interceptions to set
     */
    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    /**
     * @return the forcedfumbles
     */
    public int getForcedfumbles() {
        return forcedfumbles;
    }

    /**
     * @param forcedfumbles the forcedfumbles to set
     */
    public void setForcedfumbles(int forcedfumbles) {
        this.forcedfumbles = forcedfumbles;
    }
    
    
}
