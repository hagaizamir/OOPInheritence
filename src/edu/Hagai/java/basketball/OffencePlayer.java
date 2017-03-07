package edu.Hagai.java.basketball;
import edu.Hagai.java.utils.IO;

import java.time.LocalDateTime;

public class OffencePlayer extends Player{
    private static String category = "Offence";
    //properties:
    private double offensiveFouls;

    //constructor:
    public OffencePlayer(String firstName, LocalDateTime birthDate, Float height, int shirtNumber, int pctFromTheLine, int pctFromTheField, int pctFromThree, double offensiveFouls) {
        super(firstName, birthDate, height, shirtNumber, pctFromTheLine, pctFromTheField, pctFromThree, OffencePlayer.category);
        this.offensiveFouls = offensiveFouls;
    }

    //constructor:
    public OffencePlayer() {
        super();
        offensiveFouls = IO.getDouble("Enter Num of Offensive fouls: ");
        setCategory(category);
    }

    @Override
    public void whatsYourCategory() {

    }

    //public API:
    public void pass(){
        System.out.println("Passing");
    }
    @Override
    public String toString() {
        return super.toString() +  "\n" +getClass().getSimpleName() +
                "{" +
                "offensiveFouls=" + offensiveFouls +
                '}';
    }

    //getters and setters:
    public double getOffensiveFouls() {
        return offensiveFouls;
    }

    public void setOffensiveFouls(double offensiveFouls) {
        this.offensiveFouls = offensiveFouls;
    }
}