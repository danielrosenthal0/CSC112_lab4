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


    //1) create Vehicle constructor
    public Vehicle() {
        String Vtag;
        String Vvin;
        double Vpurchaseprice;
        int Vpurchaseyear;
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

    //3) override toString method to print the vehicle info

}
