// Car class which inherits (extends) the Vehicle class
// Cars have additional information:
//      model name
//      window tint
//      number of doors

public class Car extends Vehicle {

    private String CmodelName;
    private boolean Cwindowtint;
    private int Cnumdoors;


    //1) Car parametrized constructor
    public Car(String tag, String vin, double pprice, int pyear,
               String CmodelName, boolean Cwindowtint, int Cnumdoors) {
        super(tag, vin, pprice, pyear);
        this.CmodelName = CmodelName;
        this.Cwindowtint = Cwindowtint;
        this.Cnumdoors = Cnumdoors;

        // 1.1)ccall Vehicle constructor


    }

    //2) override Vehicle method getType, getTax
    //getType??
    public double getTax() {
        double tax = 0.0;
        tax = ((0.055*Vpurchaseprice)*(2021-Vpurchaseyear)) + 17.45;
        if (Cwindowtint = true) {
            tax = Math.round(tax + 15);
        }
        if (Cnumdoors > 2) {
            tax = Math.round(tax + 4.73*Cnumdoors);
        }
        return tax;
    }
    //2.1) getTax should compute the tax for Car as described in the project description
    //3) override toString method
    @Override
    public String toString() {

        return("The car's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the car is $"
                + getTax() + " based on the fact that the vehicle was bought in " + Vpurchaseyear +
                ", whether or not the car has tinted windows, and because the car has " +
                Cnumdoors + " doors.");

    }
//    public String toString(){
//        return "Car:  "+super.Vtag;
//    }
}
