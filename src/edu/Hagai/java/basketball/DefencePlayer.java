package edu.Hagai.java.basketball;
import edu.Hagai.java.utils.IO;

import java.time.LocalDateTime;

public class DefencePlayer extends Player{
    private static String category = "Defence";
    //properties:
    private double numBlocks;

    //constructor:
    public DefencePlayer(String firstName, LocalDateTime birthDate, Float height, int shirtNumber, int pctFromTheLine, int pctFromTheField, int pctFromThree, double numBlocks) {
        super(firstName, birthDate, height, shirtNumber, pctFromTheLine, pctFromTheField, pctFromThree, DefencePlayer.category);
        this.numBlocks = numBlocks;
    }

    //constructor:
    public DefencePlayer() {
        super();
        numBlocks = IO.getDouble("Enter Num of Blocks: ");
        setCategory(category);

    }

    @Override
    public void whatsYourCategory() {

    }

    //public API:
    public void block(){
        System.out.println("Blocking");
    }
    @Override
    public String toString() {
        return super.toString() +  "\n" +getClass().getSimpleName() +
                "{" +
                "numBlocks=" + numBlocks +
                '}';
    }

    //getters and setters:
    public double getNumBlocks() {
        return numBlocks;
    }

    public void setNumBlocks(double numBlocks) {
        this.numBlocks = numBlocks;
    }
}