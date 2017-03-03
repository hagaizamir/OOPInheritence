package edu.Hagai.java;

import edu.Hagai.java.terminal.VIPPassenger;
import edu.Hagai.java.zoo.Cow;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Cow c = new Cow("Matilda");
//        System.out.println(c.toString());
        VIPPassenger p = new VIPPassenger("Dave" , 22 , 0.5);
        double priceToPay = p.priceToPay(100);
        System.out.println(p.toString());
        System.out.println(priceToPay);
    }

}
