package edu.oregonstate.cs361.battleship;

/**
 * Created by River Hendriksen on 1/30/17.
 * Hoo boy did this take a long time to figure out. This is a class that makes that lovely json file that we all want to use you know?
 * it makes a ton of private ships classes (indvidual ships that will make up the battleship model, see ships.java for more info) for the user and the player.
 * It also uses the location class, see that for more info. This object intializes the values for battleship and allows for copying which hopefully will be used
 * to transfer json in the battleship model.
 */

import java.util.*;

public class BattleshipModel {

    //ship names duh
    private ships aircraftCarrier;
    private ships battleship;
    private ships cruiser;
    private ships destroyer;
    private ships submarine;
    private ships computer_aircraftCarrier;
    private ships computer_battleship;
    private ships computer_cruiser;
    private ships computer_destroyer;
    private ships computer_submarine;

    //hit information for the user and computer
    private ArrayList<location> playerHits;
    private ArrayList<location> playerMisses;
    private ArrayList<location> computerHits;
    private ArrayList<location> computerMisses;

    //Intial value for the battleshipmodel object, it calls on the ships object to intialize those values, it's weird trust me.
    public BattleshipModel () {

        //player
        aircraftCarrier = new ships("AircraftCarrier", 5, new location(0,0), new location(0,0));
        battleship = new ships("Battleship", 4, new location(0,0), new location(0,0));
        cruiser = new ships("Cruiser", 3, new location (0,0), new location(0,0));
        destroyer = new ships("Destroyer", 2, new location(0,0), new location(0,0));
        submarine = new ships("Submarine", 2, new location(0,0), new location(0,0));


        //hardcoded locations for the ships
        computer_aircraftCarrier = new ships("Computer_AircraftCarrier", 5, new location(2,2), new location(2,7));
        computer_battleship = new ships("Computer_Battleship", 4, new location(2,8), new location(6,8));
        computer_cruiser = new ships("Computer_Cruiser", 3, new location(4,1), new location(4,4));
        computer_destroyer = new ships("Computer_Destroyer", 2, new location(7,3), new location(7,5));
        computer_submarine = new ships("Computer_Submarine", 2, new location(9,6), new location(9,8));

        //player - again, and computer since this part is not hardcoded
        playerHits = new ArrayList<location>();
        playerMisses = new ArrayList<location>();
        computerHits = new ArrayList<location>();
        computerMisses = new ArrayList<location>();
    }

    //If there are already is a battleship model and you want to convert the inputted json file into the model format, idk if this actually works
    //NOTE: This is for the reqmodel function in main, since i dont use it for new model I left it commented.
    //NOTE: It uses the copy function in the ships file - River

    /*public BattleshipModel(BattleshipModel newship){
        aircraftCarrier= newship.aircraftCarrier;
        battleship = new ships(newship.battleship);
        cruiser = new ships (newship.cruiser);
        destroyer = new ships(newship.destroyer);
        submarine = new ships(newship.submarine);
        computer_aircraftCarrier= new ships(newship.computer_aircraftCarrier);
        computer_battleship = new ships(newship.computer_battleship);
        computer_cruiser = new ships(newship.computer_cruiser);
        computer_destroyer = new ships(newship.computer_destroyer);
        computer_submarine = new ships(newship.computer_submarine);
        playerHits = new ArrayList<location>(newship.playerHits);
        playerMisses = new ArrayList<location>(newship.playerMisses);
        computerHits = new ArrayList<location>(newship.computerHits);
        computerMisses = new ArrayList<location>(newship.computerMisses);
    }*/
    public void setAircraftCarrier(ships A){
        aircraftCarrier = A;

    }

    public void setBattleship(ships A){
        battleship = A;

    }

    public void setCruiser(ships A){
        cruiser = A;

    }
    public void setDestroyer(ships A){
        destroyer = A;

    }
    public void setSubmarine(ships A){
        submarine = A;

    }
    public ships getaircraftCarrier(){
        return aircraftCarrier;
    }

    public ships getbattleship(){
        return battleship;
    }

    public ships getcruiser(){
        return cruiser;
    }

    public ships getdestroyer(){
        return destroyer;
    }
    public ships getsubmarine(){
        return submarine;
    }
    public ships getComputer_aircraftCarrier(){
        return computer_aircraftCarrier;
    }

    public ships getComputer_battleship(){
        return computer_battleship;
    }

    public ships getComputer_cruiser(){
        return computer_cruiser;
    }

    public ships getComputer_destroyer(){
        return computer_destroyer;
    }
    public ships getComputer_submarine(){
        return computer_submarine;
    }

    public String userHitsOrMisses(location point){
        String result;

        if(computer_aircraftCarrier.checkIfHit(point,computer_aircraftCarrier))
        {
            result = "you have hit the enemies ship, fire away";
            playerHits.add(point);
        }
		
		else if (computer_battleship.checkIfHit(point,computer_battleship))
        {
            result = "you have hit the enemies ship, fire away";
            playerHits.add(point);
        } 
		
		else if (computer_cruiser.checkIfHit(point,computer_cruiser))
        {
            result = "you have hit the enemies ship, fire away";
            playerHits.add(point);
        } 
		
		else if (computer_destroyer.checkIfHit(point,computer_destroyer))
        {
            result = "you have hit the enemies ship, fire away";
            playerHits.add(point);
        } 
		
		else if (computer_submarine.checkIfHit(point,computer_submarine))
        {
            result = "you have hit the enemies ship, fire away";
            playerHits.add(point);
        }
        
		else{
            result = "You have missed your shot, fire in new location";
            playerMisses.add(point);
        }
        return result;

    }

    public String computerHitsOrMisses(location point){
        String result;

        if(aircraftCarrier.checkIfHit(point,aircraftCarrier))
        {
            result = "you have hit the enemies ship, fire away";
            computerHits.add(point);
        }
        else if (battleship.checkIfHit(point,battleship))
        {
            result = "you have hit the enemies ship, fire away";
            computerHits.add(point);
        } else if (cruiser.checkIfHit(point,cruiser))
        {
            result = "you have hit the enemies ship, fire away";
            computerHits.add(point);
        } else if (destroyer.checkIfHit(point,destroyer))
        {
            result = "you have hit the enemies ship, fire away";
            computerHits.add(point);
        } else if (submarine.checkIfHit(point,submarine))
        {
            result = "you have hit the enemies ship, fire away";
            computerHits.add(point);
        }
        else{
            result = "You have missed your shot, fire in new location";
            computerMisses.add(point);
        }
        return result;

    }

}
