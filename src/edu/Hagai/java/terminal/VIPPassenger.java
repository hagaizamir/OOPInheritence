package edu.Hagai.java.terminal;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class VIPPassenger extends Passenger {
    private  double extraDiscount;

    public VIPPassenger(String name, double age, double extraDiscount) {
        super(name, age);
        this.extraDiscount = extraDiscount;
    }

    public VIPPassenger() {
        super();
    }

    //BL method
    @Override
    public double priceToPay(double basicTicketPrice) {
       double daddy =  super.priceToPay(basicTicketPrice);
        return daddy *  (1- extraDiscount);
    }

    @Override
    public String toString() {
        return super.toString() + "\nExtra Discount: " + extraDiscount;
    }

    //getter and setter

    public double getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }
}
