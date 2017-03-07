package edu.Hagai.java;

import edu.Hagai.java.basketball.Team;
import edu.Hagai.java.terminal.VIPPassenger;
import edu.Hagai.java.zoo.Cow;
import edu.Hagai.java.terminal.Flight;
import edu.Hagai.java.terminal.Passenger;
import edu.Hagai.java.terminal.VIPPassenger;
import edu.Hagai.java.zoo.Animal;
import edu.Hagai.java.zoo.Cow;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
	// write your code here
        Team t = new Team("Chicago");
        Team t2 = new Team("HBS");

        for (int i = 0; i <1 ; i++) {
            t.add();
            t2.add();

        }
        int tScore = t.teamThrowFromThree();
        int t2Score = t2.teamThrowFromThree();

        if (tScore > t2Score)
            System.out.println(t.getName()  +"wins");
        else if (t2Score>tScore)
            System.out.println(t.getName () + "wins");

//        public static void main(String[] args) {
//            Object o = new Object();
//            System.out.println(o.getClass().getName());
//
//            System.out.println(o.getClass().getSimpleName())
//        }

//        Cow c = new Cow("Matilda");
//        System.out.println(c.toString());
//        VIPPassenger p = new VIPPassenger("Dave" , 22 , 0.5);
//        double priceToPay = p.priceToPay(100);
//        System.out.println(p.toString());
//        System.out.println(priceToPay);
        ArrayList<Passenger> passengers = new ArrayList<>();

        //VIP
        VIPPassenger vipPassenger = new VIPPassenger("Hillary", 20, 0.1);


        //Regular Passenger
        Passenger moe = new Passenger("Moe", 22);

        //Add all passengers to the list, VIP's and regulars in the same list.
        passengers.add(moe);
        passengers.add(vipPassenger);

        //print all the list: (toString is known to JAVA)
        System.out.println(passengers);

        //init a flight, use polymorphysm to add the passengers using one method.
        Flight f = new Flight();
        f.bookFlight(vipPassenger);
        f.bookFlight(moe);


    }
}



