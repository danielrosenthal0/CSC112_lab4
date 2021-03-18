// Base class vehicle
//
// David John
// March 2021


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Vehicle {

    public static enum Venum  {car, truck, motorcycle, moped};

    protected String Vtag;
    protected String Vvin;
    protected double Vpurchaseprice;
    protected int  Vpurchaseyear;
    protected double tax;
    protected String type;
    protected String tag;

    //1) create Vehicle constructor
    public Vehicle() {
        String Vtag;
        String Vvin;
        double Vpurchaseprice;
        int Vpurchaseyear;
        double tax;
        String type;
        String tag;
    }
    public Vehicle (String tag, String vin, double pprice, int pyear) {
        this.Vtag = tag;
        this.Vvin = vin;
        this.Vpurchaseprice = pprice;
        this.Vpurchaseyear = pyear;
    }


    //2) create getters and setters for the data memebers get tag
    //tag getter
    public String getVtag() {

        return Vtag;
    }
    //tag setter
    public void setVtag(String newTag) {

        this.Vtag = newTag;
    }

    //I included getters and setters for the rest of the variables but they were never used


//    //vin getter
//    public String getVvin() {
//
//        return Vvin;
//    }
//    //vin setter
//    public void setVvin(String newVin) {
//
//        this.Vvin = newVin;
//    }
//    //purchase price getter
//    public double getPrice() {
//
//        return Vpurchaseprice;
//    }
//    //purchase price setter
//    public void setVpurchaseprice(double newPurchasePrice) {
//
//        this.Vpurchaseprice = newPurchasePrice;
//    }
//    //purchase year getter
//    public int getPurchaseYear() {
//
//        return Vpurchaseyear;
//    }
//    //purchase year setter
//    public void setVpurchaseyear(int newPurchaseYear) {
//
//        this.Vpurchaseyear = newPurchaseYear;
//    }
    //type getter
    public String getType() {
        return "Vehicle";
    }
    //type setter
    public void setType(String newType) {
        this.type = newType;
    }

    //tag getter
    public String getTag() {
        return Vtag;
    }
    //tag setter
    public void setTag(String newTag) {
        this.tag = newTag;
    }
     //2.1) getTax should compute the basic vehicle tax based on purchase price
    //if statement determines what type of tax to calculate
    public double getTax() {
        double tax = 0.0;
        double years = 0.0;
        if (2021 - Vpurchaseyear > 10) {
            tax = Vpurchaseprice * 0.055;
            return tax;
        } else if (2021 - Vpurchaseyear == 0) {
            tax = Vpurchaseprice * 0.055;
            tax = tax*2;
            return tax;
        } else {
            //not totally sure if tax is calculated right b/c instructions were confusing but
            //gets the age of car and converts to decimal, multiplies by tax and adds it back onto tax
            years = 2021 - Vpurchaseyear;
            years = years / 10;
            years = 1 - years;
            tax = (0.055 * Vpurchaseprice);
            tax = tax + tax*years;
            return tax;
        }

    }

    //3) override toString method to print the vehicle info

    //print method that isn't used
    @Override
    public String toString() {

        return("The vehicle's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the vehicle is $"
                + getTax() + " because the vehicle was bought in " + Vpurchaseyear + ".");
    }
}
