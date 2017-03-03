package edu.Hagai.java.terminal;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Passenger {
   private String name;
   private double age;

    public Passenger(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Passenger() {
    }
    //business logic
    public String toString (){
        System.out.println();
        return "Name: " + name + "\nAge: " + age;
    }
    public double priceToPay (double basicTicketPrice){
        return basicTicketPrice *3;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

}
