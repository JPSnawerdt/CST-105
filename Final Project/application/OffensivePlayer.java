/*
my name is john snawerdt and this is my own work
 */
package nfldraft;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author John
 */
public class OffensivePlayer extends NFLPlayer {
    private int rushingyards;
    private int passingyards;
    private int touchdowns;
    private int receivingyards;
    private int interceptionsthrown;
    private int lostfumbles;
    
    public OffensivePlayer(){
        
    }
    
    public OffensivePlayer(String name,int age, double height, double weight, String position, int grade, int speed, int elusiveness,
            int rushingyards, int passingyards, int touchdowns, int receivingyards, int interceptionsthrown, int lostfumbles, String status){
            this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
                this.position = position;
                this.grade = grade;
                this.speed = speed;
                this.elusiveness = elusiveness;
                this.rushingyards= rushingyards;
                this.passingyards= passingyards;
                this.touchdowns = touchdowns;
                this.receivingyards= receivingyards;
                this.interceptionsthrown = interceptionsthrown;
                this.lostfumbles= lostfumbles;
                this.status= new SimpleStringProperty(status);
    }
    @Override
    public String toString(){
            return "Name:" +name;
            
            
        }

    /**
     * @return the rushingyards
     */
    public int getRushingyards() {
        return rushingyards;
    }

    /**
     * @param rushingyards the rushingyards to set
     */
    public void setRushingyards(int rushingyards) {
        this.rushingyards = rushingyards;
    }

    /**
     * @return the passingyards
     */
    public int getPassingyards() {
        return passingyards;
    }

    /**
     * @param passingyards the passingyards to set
     */
    public void setPassingyards(int passingyards) {
        this.passingyards = passingyards;
    }

    /**
     * @return the touchdowns
     */
    public int getTouchdowns() {
        return touchdowns;
    }

    /**
     * @param touchdowns the touchdowns to set
     */
    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    /**
     * @return the receivingyards
     */
    public int getReceivingyards() {
        return receivingyards;
    }

    /**
     * @param receivingyards the receivingyards to set
     */
    public void setReceivingyards(int receivingyards) {
        this.receivingyards = receivingyards;
    }

    /**
     * @return the interceptionsthrown
     */
    public int getInterceptionsthrown() {
        return interceptionsthrown;
    }

    /**
     * @param interceptionsthrown the interceptionsthrown to set
     */
    public void setInterceptionsthrown(int interceptionsthrown) {
        this.interceptionsthrown = interceptionsthrown;
    }

    /**
     * @return the lostfumbles
     */
    public int getLostfumbles() {
        return lostfumbles;
    }

    /**
     * @param lostfumbles the lostfumbles to set
     */
    public void setLostfumbles(int lostfumbles) {
        this.lostfumbles = lostfumbles;
    }
    
}
