package edu.Hagai.java.basketball;

import edu.Hagai.java.IO;
import edu.Hagai.java.MRandom;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Player {
    private String firstName;
    private  String lastName;
    private double percentFromLine;
   private double percentFromField;

    public Player(String firstName, String lastName, double percentFromLine, double percentFromField) {
        this.firstName = IO.getString("Enter first name");
        this.lastName = IO.getString("Enter last name");
        this.percentFromLine = percentFromLine;
        this.percentFromField = percentFromField;
    }

    public Player () {

    }



    //methods
    public boolean throwFromLine() {
        MRandom m = new MRandom();
        int i = m.nextInt(1, 100);
        if (i <= percentFromLine) {

        }
        return true;

        {
            public boolean throwField (){
            MRandom m = new MRandom();
            int i = m.nextInt(1, 100);
            if (i <= percentFromField) {

            }
            return true;

            {


        }


