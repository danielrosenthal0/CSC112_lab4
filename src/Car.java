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
    public String getType() {
        return "Car";
    }

    //overrides vehicle tax, checks window tint and num of doors on top of normal vehicle tax
    public double getTax() {
        tax = super.getTax();
        if (Cwindowtint = true) {
            tax = Math.round(tax + 15);
        }
        if (Cnumdoors > 2) {
            tax = Math.round(tax + 4.73*Cnumdoors);
        }
        tax = tax + 17.45;
        tax = (double)Math.round(tax * 1000) /1000;
        return tax;
    }
    //2.1) getTax should compute the tax for Car as described in the project description
    //3) override toString method

    //another print statement that isn't used
    @Override
    public String toString() {

        return("The car's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the car is $"
                + getTax() + " because the vehicle was bought in " + Vpurchaseyear +
                " for $" + Vpurchaseprice + "  because the car has " +
                Cnumdoors + " doors.");

    }
}
