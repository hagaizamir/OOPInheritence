package edu.Hagai.java.zoo;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Cow extends Animal{

    public Cow (String name) {
        super(name, "Cow");
    }

    public void  makeSound (){
        System.out.println("Mooo");
    }
    public void  giveMilk (){
        System.out.println(" Giving milk");
    }
}
