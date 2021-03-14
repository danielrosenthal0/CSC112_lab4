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
    private double tax;

    //1) create Vehicle constructor
    public Vehicle() {
        String Vtag;
        String Vvin;
        double Vpurchaseprice;
        int Vpurchaseyear;
        double tax;
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
     //2.1) getTax should compute the basic vehicle tax based on purchase price
    public double getTax() {
        double tax = 0.0;
        tax = (0.055*Vpurchaseprice)*(2021-Vpurchaseyear);
        return tax;
    }
    public void setTax(double newTax) {
        this.tax = newTax;
    }

    //3) override toString method to print the vehicle info
//print method
    @Override
    public String toString() {

        return("The vehicle's tag is " + Vtag + " and the tax on the vehicle is " + tax);
    }
}
