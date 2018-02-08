/*
My NAme is John Snawerdt and this is my own work
 */
package nflplayer;

public class NFLPlayer {
    

	public String name;

	public int age;

	public double height;

	public double weight;

	public String position;
        
        public int grade;
        
        public int rushingyards;
        
        public int passingyards;
        
        public int tackles;
        
        public int receivingyards;
        
        public int touchdowns;
        
        public int sacks;
        
        public int speed;
        
        public int elusiveness;
        
        //default constructor
	public NFLPlayer() {

	}
        //constructor
	public NFLPlayer(String name, int age, double height, double weight, String position, int grade, int rushingyards,
        int passingyards, int tackles, int receivingyards, int touchdowns, int sacks, int speed, int elusiveness) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
                this.position = position;
                this.grade = grade;
                this.rushingyards = rushingyards;
                this.passingyards= passingyards;
                this.tackles = tackles;
                this.receivingyards = receivingyards;
                this.touchdowns = touchdowns;
                this.sacks = sacks;
                this.speed = speed;
                this.elusiveness = elusiveness;
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
            
        public int getRushingYards(){
            return rushingyards;
        }
        public void setRushingYards(int RushingYards){
            this.rushingyards = RushingYards;    
        }
        
        public int getPassingYards(){
            return passingyards;
        }
        public void setPassingYards(int PassingYards){
            this.passingyards = PassingYards;    
        }
        
        public int getReceivingYards(){
            return receivingyards;
        }
        public void setReceivingYards(int ReceivingYards){
            this.receivingyards = ReceivingYards;    
        }
        
        public int getTackles(){
            return tackles;
        }
        public void setTackles(int Tackles){
            this.tackles = Tackles;    
        }
        
        public int getTouchdowns(){
            return touchdowns;
        }
        public void setTouchdowns(int Touchdowns){
            this.touchdowns = touchdowns;    
        }
        
        public int getSacks(){
            return sacks;
        }
        public void setSacks(int Sacks){
            this.sacks = Sacks;    
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
        public void printPlayer(){
        System.out.println("Name:" +name);   
        System.out.println("Age: " +age);
        System.out.println("Weight: " +weight+ " lbs");
        System.out.println("Height: " +height+ " inches");
        System.out.println("Position: " +position);
        System.out.println("Overall Grade: " +grade);
        System.out.println("Rushing Yards " +rushingyards);
        System.out.println("Passing Yards: " +passingyards);
        System.out.println("Receiving Yards: " +receivingyards);
        System.out.println("Touchdowns: " +touchdowns);
        System.out.println("Tackles: " +tackles);
        System.out.println("Sacks: " +sacks);
        System.out.println("Speed: " +speed);
        System.out.println("Elusiveness " +elusiveness);
        }
        
        

}
