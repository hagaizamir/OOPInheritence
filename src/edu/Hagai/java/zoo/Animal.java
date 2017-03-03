package edu.Hagai.java.zoo;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Animal {
    private final String name;
    private final String species;

    //don't use specific IO ....don't mix presentation with logic
//    public void print (){
//        System.out.println(toString());
//    }


    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String toString (){
        return  "Name: " + name + "\nSpecies: " + species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
