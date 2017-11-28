import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Expand on this so that your main GUI can

public class Player extends MyBoard {

    private String name;
    private int age;
    private int wins;
    private int losses;


    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public Player(String name, int age,int wins,int losses) {
        setName(name);
        setAge(age);
        setWins(wins);
        setLosses(losses);

    }
public Player(){
        
    }
    //put in a toString()

    @Override
    public String toString() {
        return super.toString();
    }



    //add options in your main GUI to allow you to register a new player,
    //amend the details of a player and remove a player
    //and show the 5 players with the highest win percentages
}


