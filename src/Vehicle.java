// Base class vehicle
//
// David John
// March 2021


public class Vehicle {



    public static enum Venum  {car, truck, motorcycle, moped};

    protected String Vtag;
    protected String Vvin;
    protected double Vpurchaseprice;
    protected int  Vpurchaseyear;
    protected double tax;

    //1) create Vehicle constructor
    public Vehicle() {
        String Vtag;
        String Vvin;
        double Vpurchaseprice;
        int Vpurchaseyear;
        double tax;
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
    //vin getter
    public String getVvin() {
        return Vvin;
    }
    //vin setter
    public void setVvin(String newVin) {
        this.Vvin = newVin;
    }
    //purchase price getter
    public double getPrice() {
        return Vpurchaseprice;
    }
    //purchase price setter
    public void setVpurchaseprice(double newPurchasePrice) {
        this.Vpurchaseprice = newPurchasePrice;
    }
    //purchase year getter
    public int getPurchaseYear() {
        return Vpurchaseyear;
    }
    //purchase year setter
    public void setVpurchaseyear(int newPurchaseYear) {
        this.Vpurchaseyear = newPurchaseYear;
    }
     //2.1) getTax should compute the basic vehicle tax based on purchase price
    public double getTax() {
        double tax = 0.0;
        //not sure how to call purchase price
        //tax = Vpurchaseprice;
        tax = Math.round((0.055 * Vpurchaseprice)*(2021 - Vpurchaseyear));
        return tax;

    }
    public void setTax(double newTax) {
        this.tax = newTax;
    }

    //3) override toString method to print the vehicle info

    //print method
    @Override
    public String toString() {

        return("The vehicle's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the vehicle is $"
                + getTax() + " based on " +
                "the fact that the vehicle was bought in " + Vpurchaseyear + ".");
    }
}
