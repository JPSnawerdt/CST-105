/*
My Name is John Snawerdt and this is my own work
 */
package nfldraft;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author John
 */
public abstract class NFLPlayer {
    

	public String name;

	public int age;

	public double height;

	public double weight;

	public String position;
        
        public int grade;
        
        public int speed;
        
        public int elusiveness;
        
        public SimpleStringProperty status;
        
        //default constructor
	public NFLPlayer() {

	}
        //constructor
	public NFLPlayer(String name, int age, double height, double weight, String position, int grade, int speed, int elusiveness, String status) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
                this.position = position;
                this.grade = grade;
                this.speed = speed;
                this.elusiveness = elusiveness;
                this.status= new SimpleStringProperty(status);
	}
        public String toString(){
            return "Name:" +name;
            
            
        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String Position) {
		this.position = Position;
	}
        
        public int getGrade(){
            return grade;
        }
        public void setGrade(int Grade){
            this.grade = Grade;
        }    
        
                public int getSpeed(){
            return speed;
        }
        public void setSpeed(int Speed){
            this.speed = Speed;    
        }
        
                public int getElusiveness(){
            return elusiveness;
        }
        public void setElusiveness(int Elusiveness){
            this.elusiveness = Elusiveness;    
        }
        
        public void setStatus(String Status){
            this.status.set(Status);
        }
        
        public String getStatus(){
            return status.get();
        }
        public void printPlayer(){
        System.out.println("Name:" +name);   
        System.out.println("Age: " +age);
        System.out.println("Weight: " +weight+ " lbs");
        System.out.println("Height: " +height+ " inches");
        System.out.println("Position: " +position);
        System.out.println("Overall Grade: " +grade);
        System.out.println("Speed: " +speed);
        System.out.println("Elusiveness " +elusiveness);
        }
        
        

}