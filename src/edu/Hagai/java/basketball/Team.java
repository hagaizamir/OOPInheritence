package edu.Hagai.java.basketball;
import edu.Hagai.java.utils.IO;

import java.util.ArrayList;

public class Team {
    //composition vs aggregation
    private ArrayList<Player> players = new ArrayList<>();
    private String name;


    //constructors:
    public Team(String name) {
        this.name = name;
    }

    //constructor:
    public Team() {
        name = IO.getString("Enter Team Name: ");
    }

    public void add(){
        int choice = IO.getInt(
                "1) Offence\n" +
                "2) Defence\n" +
                "3) Center"
        );

        switch (choice){
            case 1:
                players.add(new OffencePlayer());
                break;
            case 2:
                players.add(new DefencePlayer());
                break;
            case 3:
                players.add(new CenterPlayer());
                break;
        }
    }

    public void printAllThePlayers(){
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void teamThrowFromThree(){
        for (Player p : players) {
            boolean didScore = p.throwFrom3();
            System.out.println(didScore?"Scored": "Missed...");
        }
    }
}