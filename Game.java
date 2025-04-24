/**
 * Welcome to the beginning of your adventure game project! Before you begin 
 * in this file, read the instructions in README.md. Make a copy of this file 
 * in your project folder on your machine, which you will use throughout the 
 * semester.
 * 
 * Instructions:
 * Follow the inline instructions, where tasks are marked by "TODO:". In this 
 * file, you will accept user input and split that input into a format that 
 * the computer can understand. This will occur continuously until the user 
 * enters "q".
 * 
 * Finally, write  a description of the class and update the author and version
 * tags.
 * 
 * Write a description of class Game here.
 * Game is a class that defines the rooms and players in the game.It accepts user input.
 *
 * @author Cameron Li
 * @version Spring 2025 April 23
 */
public class Game {
    
    Player p1;
    Room r0, r1, r2;
    
    
    public Game(){
        Animal snake=new Snake();
        Animal owl=new Owl();
        Animal villain=new Villain();
        
        
        // TODO: instantiate new objects for each of the four rooms r0, r1, r2, r3
        r0 = new Room("First Room", "The leftest room",true,snake);
        r1 = new Room("Second Room", "Room in the middle", true,owl);
        r2 = new Room("Final Room", "The rightest room", true, villain);
        
        r0.setNextRoom(r1); 
        r1.setNextRoom(r2);  
        
        
        p1 = new Player("player 1");
        p1.setLocation(r0);
        //System.out.println("You are starting in: "+p1.getLocation());
    }
    

    public void movePlayer(String direction) {
        direction = direction.toLowerCase();
        Room currentRoom = p1.getLocation();
        
        Room nextRoom = null;
        /*switch (direction) {
            case "north":
               nextRoom = currentRoom.getN();
               break;
            case "south":
                nextRoom = currentRoom.getS();
                break;
            case "east":
                nextRoom = currentRoom.getE();
                break;
            case "west":
                nextRoom = currentRoom.getW();
                break;
            default:
            System.out.println("Unknown direction, player did not move.");
            return;
                
        }*/
        
        
        if (nextRoom != null) {
            p1.setLocation(nextRoom);
            //System.out.println("You are now in: " + nextRoom);
                if (nextRoom.animal != null) {
                int damage = nextRoom.animal.getAnimalDamage();
                //System.out.println("A " + nextRoom.animal.getAnimalName() + " attacked you!");
                p1.takeDamage(damage);
                //System.out.println("Your health is now at " + p1.getHealth() + " points.");
            }//else {
            //System.out.println("The location you wish to go to is not valid!");
            //System.out.println("You are now in: " + currentRoom); }
        //}//else {
            //System.out.println("The location you wish to go to is not valid!");
        //}    
    }
}
    public Animal getAnimal(){
        Room currentRoom = p1.getLocation();
        return currentRoom.getAnimal();
    }
    
    public Player getPlayer(){
        return p1;
    }
    
    public String getCurrentRoomQuestion(){//gets the question/prompt for the room
        Room currentRoom = p1.getLocation();
        Animal a = currentRoom.getAnimal();
        String question = "";
        if(a instanceof Owl){
            question = ((Owl)a).getQuestion();
        }else if (a instanceof Snake){
            question = ((Snake)a).getQuestion();
        }else if (a instanceof Villain){
            question = ((Villain)a).getQuestion();}
            else{
                question = "no question available";
            }
        return question;
    }
    
    public String checkRoomAnswer(String answer){
        Animal animal = getAnimal();
        if(animal instanceof Owl){
            Owl o = (Owl)animal;
            if(o.playTruthGame(answer)){
                getPlayer().setLocation(r1);
                return o.correctString();
            }else{
                getPlayer().takeDamage(10);
                return o.incorrectString();
            }
        }
        return ""; 
    }
    
    public void resetPlayer(Room r){
        p1.setHealth(100);
        p1.setLocation(r0);
    }
    
    public void movePlayerToNextRoom(){
        Room current = p1.getLocation();
        p1.setLocation(current.getNextRoom());
    }

        
}
